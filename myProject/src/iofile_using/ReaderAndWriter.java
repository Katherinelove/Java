package iofile_using;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.print.DocFlavor.STRING;

/**
 * ##jdk1.7之后自动关闭资源写法    -有bug不报错，捕获异常收到抑制
 * ##获取系统自带分隔符
 * ##捕获异常收到抑制  如何手动捕获
 * 字符流
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月25日 上午9:17:44
 */
public class ReaderAndWriter {
	public static final String PathName1="E:/teacher_liao/Html/1.txt";
	public static final String PathName2="E:/teacher_liao/Html/love.txt";
	
	//获取 系统自带的分隔符  Windows默认\r\n
	public static final String separator=System.getProperty("line.separator");
	
	public static void main(String[] args) {
		read();
		writer();

	}

	private static void writer() {
		//读取的内容
		StringBuffer content=new StringBuffer("巧兰");
		content.append(separator);
		content.append("我喜欢你");
		content.append(separator);
		content.append("我喜欢你");
		content.append(separator);
		content.append("我喜欢你");
		content.append(separator);
		content.append("重要的事情说三遍");
		//jdk1.7之后自动关闭资源写法
		try(BufferedWriter bWriter=new BufferedWriter(new FileWriter(PathName2))){
			bWriter.write(content.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e){
			//由于bwriter.close会抛出IOException,这里得异常被新结构抑制了
			//以下代码用来查看被抑制的异常信息
			//思路:捕获所有异常，判断捕获抑制异常是否为空，抓取被抑制的异常，并打印
			if(e.getSuppressed()!=null) {
				//getSuppressed() 返回的是父类Throwable[]
				Throwable[] throwables=e.getSuppressed();
				for(Throwable throwable :throwables) {
					System.out.println(throwable+"case by"+throwable.getClass().getSimpleName());
				}
			}
		}
	}

	private static void read() {
		File file=new File(PathName1);
		if(!file.exists()) {
			System.out.println("读取的文件不存在！");
		}
		Reader readerStream=null;
		BufferedReader bReaderStream=null;
		try {
			readerStream=new FileReader(file);
			bReaderStream=new BufferedReader(readerStream);
			//Reader的优势 可以1行1行的读取   核心代码
			//readline（）返回的是string型
			String line="";
			while((line=bReaderStream.readLine())!=null) {
				//读取一行打印一行
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
