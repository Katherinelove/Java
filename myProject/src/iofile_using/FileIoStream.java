package iofile_using;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 最原始的文件流读取
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月23日 下午8:59:41
 */
public class FileIoStream {
	//文件名
	public static final String pathName="E:/teacher_liao/Html/1.js";
	public static void main(String[] args) {
		try {
			fileRead();
			System.out.println("读取数据完毕！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fileWrite();
			System.out.println("写入文件完毕！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void fileWrite() throws IOException {
		//写入文件
		final String pathName1="E:/teacher_liao/Html/1.txt";
		//可以直接输入文件名
		OutputStream outputStream=new FileOutputStream(pathName1);
		String content="巧兰 ilove you！";
		//字符串转字节数组
		outputStream.write(content.getBytes());
		outputStream.close();
	}

	private static void fileRead() throws IOException {
		// 读取文件  打开--关闭
		File file1=new File(pathName);
		InputStream inputStream=new FileInputStream(file1);
		//创建bytes[]数组存读取字节
		byte[] bytes=new byte[(int) file1.length()];
		//读取到bytes中
		inputStream.read(bytes);
		//将字节数组转为字符串
		String content=new String(bytes);
		System.out.println(content);
		
		//关闭
		inputStream.close();
	}
}
