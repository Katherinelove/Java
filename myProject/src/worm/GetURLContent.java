package worm;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import define_io_by_self.MyIO;

/**
 * 简单获取网页响应内容
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月30日 上午10:16:15
 */
public class GetURLContent {
	public static final String PathName="网易.html";
	//只能是http协议
	public static final String Url="http://www.163.com/index.html/";
	public static void main(String[] args) throws MalformedURLException {
		//写入文件用之前的方法
		MyIO myIO=new MyIO();
		
		URL url=new URL(Url);
		try(BufferedReader breader=new BufferedReader
				(new InputStreamReader(url.openStream()))){
			 //读取内容
			StringBuffer content=new StringBuffer();
			String line=null;
			while((line=breader.readLine())!=null) {
				System.out.println(line);
				//每行写入
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			//存储
			myIO.writeFileByWriter(content.toString(), PathName, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	

}
