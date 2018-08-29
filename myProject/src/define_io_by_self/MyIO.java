package define_io_by_self;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.text.AbstractDocument.Content;

/**
 * 方法封装输入流和输出流
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月27日 下午8:06:57
 */
public class MyIO {
	/**
	 * 以字节数组的形式读取
	 * @param pathname
	 * @return
	 * @throws IOException
	 */
	public String readFileByBufferInputStream(String pathname) throws IOException {
	
		// 打开文件
		File file=new File(pathname);
		if(!file.exists()) {
			//文件不存在，重新创建
			file.createNewFile();
		}
		
		//不用自动关闭资源  必须提前
		InputStream inStream=null;
		BufferedInputStream bufferInStream=null;
		
		inStream=new FileInputStream(file);
		bufferInStream=new BufferedInputStream(inStream);
		
		//读取类容(非字符型)
		byte[] bytes=new byte[inStream.available()];
		//缓存直接读取
		bufferInStream.read(bytes);
		System.out.println("读取文件成功！");
		
		bufferInStream.close();
		inStream.close();
		
		return new String(bytes);
	}
	/**
	 * 以字节数组的形式读取
	 * @param content  读取内容
	 * @param pathname  file路径或目录
	 */
	public void writeFileByBufferOutStream(String content,String pathname) {
		try(BufferedOutputStream bufferOutStream=
				new BufferedOutputStream(
						new FileOutputStream(new File(pathname)))) {
			bufferOutStream.write(content.getBytes());
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	/**
	 * 读取字符
	 * @param pathname
	 * @return
	 */
	public String readFileByReader(String pathname) {
		//存储内容
		StringBuffer content=new StringBuffer();
		File file=new File(pathname);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(Reader reader=new FileReader(file);
			BufferedReader breader=new BufferedReader(reader);) {
			//这里读取的行  必须是字符串型
			String line=null; 
			while((line=breader.readLine())!=null) {
				content.append(line);
			}
			System.out.println("读取完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content.toString();
	}
	public void writeFileByWriter(String content,String pathname,boolean append) {
		try(Writer writer= new FileWriter(pathname,append);
			BufferedWriter bwriter=new BufferedWriter(writer);){
			bwriter.write(content);
			System.out.println("写入完毕！");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
