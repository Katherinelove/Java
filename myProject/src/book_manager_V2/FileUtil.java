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
 * ������ --�ļ�����ɾ�Ĳ�
 * �����෽�� ��Ϊ��̬����  ����ʵ����
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��9��8�� ����10:40:00
 */
public class FileUtil {
	private static final String PathName = "D:/mygit/laojiuxuetang/myProject/files/book.dat";
	private static final String sepAttr=",";
	private static final String sepsys=System.getProperty("line.separator");
	
	
	/**
	 * ��Ҫд������������ͼ��д�룬������һ����Ҳ�����������
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
		//ע��д���ʱ���ȡ�����ַ���
		try(
				Writer writer=new FileWriter(file,false);
				BufferedWriter bwriter=new BufferedWriter(writer);	
				){
			//bufer����û��ʵ����    ---û��ʵ����  ����ᱻ����ָ�����
			StringBuffer content=new StringBuffer();
			//�жϲ�Ϊ�յ�����������
			int bookCont=bookBiz.getCount(bookArray);
			
			for (int i = 0; i <bookCont; i++) {
				content.append(bookArray[i].getBookId());
				content.append(sepAttr);
				content.append(bookArray[i].getBookName());
				content.append(sepAttr);
				content.append(bookArray[i].getBookCount());
				content.append(sepsys);
			}
			
			//ȫ����ȡ��д��
			bwriter.write(content.toString());
			System.out.println("д���ļ��ɹ���");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * ���ļ��ж�ȡ�����ַ����ü�������ֵ��������ɷ��ض�������
	 */
	public static Book[] loadBook() {
		//��ʱ��ʹ�ö�̬����
		Book[] books=new Book[999];
		//java ����������������ݣ������Զ����±�
		int count=0;
		
		File file=new File(PathName);
		if(!file.exists()) return null;
		//һ��һ�ж�ȡ�������ļ�   bufferinputstream
		try(
				Reader reader=new FileReader(file);
				BufferedReader breader=new BufferedReader(reader);
				) {
			
			//һ��һ�ж�ȡ
			String line=null;
			//10000,�ҵ�����,20
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
