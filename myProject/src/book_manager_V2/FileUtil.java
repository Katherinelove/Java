package book_manager_V2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

import book_manager_V2.BookBiz;

/**
 * 工具类 --文件的增删改查
 * 工具类方法 多为静态方法  不用实例化
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年9月8日 上午10:40:00
 */
public class FileUtil {
	private static final String PathName = "D:/mygit/laojiuxuetang/myProject/files/book.dat";
	private static final String sepAttr=",";
	private static final String sepsys=System.getProperty("line.separator");
	
	
	/**
	 * 不要写死程序，这里是图书写入，可以是一本，也可是整个书库
	 * @param bookArray
	 */
	public static void saveBook(Book ...bookArray) {
		BookBiz bookBiz = new BookBiz();
//		bookBiz.showAllBook(bookArray);
//		
//		System.out.println(bookArray[1].getBookId());
//		
		if(bookArray==null||bookArray.length==0) return;
		File file=new File(PathName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//注意写入的时候读取的是字符串
		try(
				Writer writer=new FileWriter(file,false);
				BufferedWriter bwriter=new BufferedWriter(writer);	
				){
			//bufer数组没有实例化    ---没有实例化  对象会被报空指针错误
			StringBuffer content=new StringBuffer();
			//判断不为空的数组对象个数
			int bookCont=bookBiz.getCount(bookArray);
			
			for (int i = 0; i <bookCont; i++) {
				content.append(bookArray[i].getBookId());
				content.append(sepAttr);
				content.append(bookArray[i].getBookName());
				content.append(sepAttr);
				content.append(bookArray[i].getBookCount());
				content.append(sepsys);
			}
			
			//全部读取在写入
			bwriter.write(content.toString());
			System.out.println("写入文件成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 从文件中读取，将字符串裁减，并赋值给对象，组成返回对象数组
	 */
	public static Book[] loadBook() {
		//暂时不使用动态数组
		Book[] books=new Book[999];
		//java 如何在数组后面加数据，必须自定义下标
		int count=0;
		
		File file=new File(PathName);
		if(!file.exists()) return null;
		//一行一行读取二进制文件   bufferinputstream
		try(
				Reader reader=new FileReader(file);
				BufferedReader breader=new BufferedReader(reader);
				) {
			
			//一行一行读取
			String line=null;
			//10000,我的世界,20
			String[] bookattr=null;
			while((line=breader.readLine())!=null) {
				bookattr=line.split(sepAttr);
				Book book=new Book();
				book.setBookId(bookattr[0].trim());
				book.setBookName(bookattr[1].trim());
				book.setBookCount(Integer.parseInt(bookattr[2].trim()));
				books[count++]=book;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return books;
	}
}
