package book_manager_V2;

import book_manager_V2.Book;

/**
 * ���ݿ�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��1�� ����6:58:59
 */
public class Datas {
	/**
	 * ���������������洢�洢ͼ��
	 */
	//ͼ�����ݿ�
	public static Book[] bookStore=new Book[999];
	
	//static��   ���ڱ��ࣨDatas��ʵ��
	static {
		Book book1=new Book();
		book1.setBookId("10000");
		book1.setBookName("�ҵ�����");
		book1.setBookCount(20);
		bookStore[0]=book1;
		
		Book book2=new Book();
		book2.setBookId("10001");
		book2.setBookName("����");
		book2.setBookCount(50);
		bookStore[1]=book2;
		
		Book book3=new Book();
		book3.setBookId("10002");
		book3.setBookName("�������");
		book3.setBookCount(30);
		bookStore[2]=book3;
		
		Book book4=new Book();
		book4.setBookId("10003");
		book4.setBookName("�Ż���7");
		book4.setBookCount(100);
		bookStore[3]=book4;
	}
}