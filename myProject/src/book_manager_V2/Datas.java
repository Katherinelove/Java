package book_manager_V2;

import book_manager_V2.Book;

/**
 * 数据库
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月1日 下午6:58:59
 */
public class Datas {
	/**
	 * 这里利用数组对象存储存储图书
	 */
	//图书数据库
	public static Book[] bookStore=new Book[999];
	
	//static块   先于本类（Datas）实例
	static {
		Book book1=new Book();
		book1.setBookId("10000");
		book1.setBookName("我的世界");
		book1.setBookCount(20);
		bookStore[0]=book1;
		
		Book book2=new Book();
		book2.setBookId("10001");
		book2.setBookName("爱我");
		book2.setBookCount(50);
		bookStore[1]=book2;
		
		Book book3=new Book();
		book3.setBookId("10002");
		book3.setBookName("你的名字");
		book3.setBookCount(30);
		bookStore[2]=book3;
		
		Book book4=new Book();
		book4.setBookId("10003");
		book4.setBookName("古惑仔7");
		book4.setBookCount(100);
		bookStore[3]=book4;
	}
}