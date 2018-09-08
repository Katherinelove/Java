package downloader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.swing.text.AbstractDocument.Content;

/**
 * 利用RandomAccessibleFile分块下载文件
 * 1.打开Http连接，获得下载内容的长度（格式固定）
 * 2.创建RandomAccessFile对象
 * 3.将下载的内容缓存到字节数组中
 * 4.将缓存字节数组通过RandomAccessFile对象写入到文件中（涉及到一个文件指针操作）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月4日 上午10:11:41
 */
public class DownloaderDemo {
	//设置下载网址
	static final String StrUrl="http://www.xuetang9.com/video/xuetang9_intro.mp4";
	static final String PathName="myProject/files/";
	//设置默认缓存  1M
	static final int MAX_BUFFER_SIZE=10240;
	public static void main(String[] args) {
		//连接网络
		HttpURLConnection connection=null;
		BufferedInputStream bInStream=null;
		RandomAccessFile rfile=null;
		try {
			URL url=new URL(StrUrl);
			System.out.println(url.getFile());
			
			//读取二进制 大数据用.openConnection()   不用.openStream()
			connection=(HttpURLConnection) url.openConnection();
			//这个流可以不关 关闭
			
			//设置属性-Range从服务器下载字节数的范围  0-表示不指定终止字节数
			connection.addRequestProperty("Range", "bytes=0-");
			connection.connect();   //正式连接上服务器
			
			//判读是否连接成功200-299
			if(connection.getResponseCode()/100!=2) {
				System.out.println("未连接到服务器，请重试！");
				return;
			}
			
			//获取文件大小
			int fileSize=connection.getContentLength();
			
			//要对输入输出流用Buffer**流装饰一下   并更改缓存流的默认缓存
			bInStream=new BufferedInputStream(connection.getInputStream(),MAX_BUFFER_SIZE);
			
			int downloaded=0;  //已经下载的字节数，用来计算当前下载的百分比
			String fileName=url.getFile();   //为了只获取最后文件名
			fileName=fileName.substring(fileName.lastIndexOf("/")+1);
			
			//利用RandomAccessFile读写数据
			rfile=new RandomAccessFile(new File(PathName+fileName), "rw");
			rfile.setLength(0);   //文件清零
			//核心代码
			while(downloaded<fileSize) {//当前已经下载数<文件大小，继续下载
				byte[] buffer=null;   //下载缓存数组
				if(fileSize-downloaded>MAX_BUFFER_SIZE) {
					buffer=new byte[MAX_BUFFER_SIZE];  //未下载的文件大于最大缓存，已缓存单位下载
					}else {
						buffer=new byte[fileSize-downloaded];  //未下载小于等于最大缓存，下载剩余的即可
					}
				//读取文件
				int read=rfile.read(buffer);     //read 为下载的字节数
				//这里判断什么时候终止
				if(read==-1) break;   //下载完毕
				//将当前文件写到文件中去
			
				rfile.seek(downloaded);  //设置文件指针
				rfile.write(buffer, 0, read);
				downloaded+=read;     //读取多少，计入已下载
				
				System.out.println("当前下载进度："+downloaded*1.0/fileSize*100+"%");
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				rfile.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				bInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			connection.disconnect();   //关闭连接对象
		}
		

	}

}
