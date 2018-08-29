package iofile_using;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 缓存流必须掌握--读取（非字符数据）大数据时，速度快，平时可以用filestream
 * 思路一致
 * 使用带缓存的流(相当于装饰器) 增加读写效率
 * 先关闭缓存流  在关闭文件流
 * 如果想对输入或输出的东西进行修改 
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午3:00:00
 */
public class BufferIoStreamDemo {
	public static final String PathName1="E:/teacher_liao/Html/1.txt";
	public static final String PathName2="E:/teacher_liao/Html/2.txt";
	public static void main(String[] args) {
		File file=new File(PathName1);
		InputStream inputStream=null;    //在try-catch外面定义方便关闭资源
		
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedInputStream bInoputStream=new 
				BufferedInputStream(inputStream);
		
		try {
			byte[] bytes=new byte[bInoputStream.available()];
			bInoputStream.read(bytes);
			String content=new String(bytes);
			System.out.println("读取内容："+content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bInoputStream.close();
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//写入文件
		BufferedOutputStream bOutputStream=null;
		try {
			bOutputStream=
					new BufferedOutputStream(new FileOutputStream(PathName2));
			//新建字节数组（相当于缓存流）
			StringBuffer bString=new StringBuffer("");
			bString.append("sb,来追我啊");
			bString.append("熊儿子");
			System.out.println();
			bOutputStream.write(bString.toString().getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
