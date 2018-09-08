package book_manager_V1;

import java.awt.SystemColor;
import java.util.Scanner;

import javax.swing.text.Position.Bias;

/**
 * ͼ����ӻ�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��1�� ����8:43:26
 */
public class BookView {
	private Scanner input=new Scanner(System.in);
	private BookBiz bookBiz=new BookBiz();
	
	public BookView() {
//		init();
		menu();
		start();
//		end();
	}
	

	private void start() {
		// ����ϵͳ��չʾ�˵�
		showMainView();
		while(true) {
			System.out.print("�Ƿ�������в�����Y/N��");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.out.println("X10ͼ�����ϵͳ�Ѿ��˳�����ӭ�´�ʹ�ã�");
				System.exit(0);
			}else if(choose.charAt(0)=='Y'){
				showMainView();
			}
			else {
				System.out.println("���벻�Ϸ���������ѡ��");
			}
		}

	}


	private void showMainView() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>���˵�");
		System.out.println("1.����ͼ��\n2.ɾ��ͼ��"
				+ "\n3.�鿴����ͼ��\n4.��Ų���ͼ��\n5.ͼ�����\n6.ͼ�����");
		chooseview();
	}


	private void chooseview() {
		System.out.print("��ѡ��");
		int choose=input.nextInt();
		switch (choose) {
		case 1:
			//����ͼ��
			showAddBookView();
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 2:
			//ɾ��ͼ��
			showDelBookView();
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 3:
			//�鿴����ͼ��
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 4:
			//ͨ��id����ͼ��
			showFindBookView();
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 5:
			//5.ͼ�����
			showInStore();
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 6:
			//6.ͼ�����
			showOutStore();
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 7:
			//�˳�����
			System.exit(0);
			break;
		default:
			System.out.println("���벻�Ϸ�,���������룡");
			chooseview();
			break;
		}
	}


	private void showOutStore() {
		// ������ͼ
		System.out.print("����������ͼ��id��");
		String bookId=input.next();
		System.out.print("���������ͼ���������");
		int bookCount=input.nextInt();
		if(bookBiz.outStore(bookId, bookCount)) {
			System.out.println("����ɹ���");
		}else {
			System.out.println("����ʧ�ܣ�û���ҵ����ͼ���ͼ���������㣡");
			System.out.print("�Ƿ����������������Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("�Ѿ��˳���������");
			}else if(choose.charAt(0)=='Y') {
				showOutStore();
			}
		}
	}

	private void showInStore() {
		System.out.print("���������ͼ��id��");
		String bookId=input.next();
		System.out.print("���������ͼ���������");
		int bookCount=input.nextInt();
		if(bookBiz.inStore(bookId, bookCount)) {
			System.out.println("���ɹ���");
		}else {
			System.out.println("���ʧ�ܣ�û���ҵ����ͼ�飡");
			System.out.print("�Ƿ����������������Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("�Ѿ��˳���������");
			}else if(choose.charAt(0)=='Y') {
				showInStore() ;
			}

		}
	}

	private void showFindBookView() {
		System.out.print("�������ѯ���id��");
		String bookId=input.next();
		Book book=bookBiz.findBook(bookId);
		if(book!=null) {
			System.out.println("����ͼ��ɹ���");
			bookBiz.showAllBook(book);
		}
	}

	private void showDelBookView() {
		// ɾ��ͼ��
		System.out.print("������Ҫ���ͼ���id��");
		String bookId=input.next();
		//����find��������
		Book book=bookBiz.findBook(bookId);
		if(book==null) {
			//û���ҵ�ͼ��
			System.out.println("sorry,û����Ҫɾ����ͼ�飡");
			System.out.println("����������:");
			showDelBookView();
		}else {
			bookBiz.delBook(book);
			System.out.println("ɾ��ͼ�飺"+book.getBookName()+"�ɹ���");
		}	
	}

	private void showAddBookView() {
		//�����ж�ͼ�����Ƿ������¼�루�����ڿ������Bookʱʵ��������Լ�ռ䣩
		System.out.print("������ͼ���ţ�");
		String bookId=input.next();
		Book book=bookBiz.findBook(bookId);
		if(book==null) {
			//û���ҵ�,����Ϊ�� ʵ����
			book=new Book();
			book.setBookId(bookId);
			System.out.print("������ͼ�����ƣ�");
			book.setBookName(input.next());
			System.out.print("���������ͼ��Ŀ�棺");
			book.setBookCount(input.nextInt());
			
			//*****
			bookBiz.addBook(book);
			System.out.println("���ͼ��ɹ���");
		}else {
			//��ʾͼ���Ѿ�����
			System.out.println("¼��ͼ��id�Ѿ����ڣ�������¼�룺");
			//�ݹ����
			showAddBookView();
		}
	}

	private void menu() {	
		while(true) {
			System.out.println("��ӭʹ��x10ͼ�����ϵͳ��");
			System.out.println("=====================================");
			System.out.println("1.��¼ϵͳ\t2.�˳�ϵͳ");
			System.out.print("��ѡ��");
			String choose=input.next();
			System.out.println("\n=====================================");
			if("1".equals(choose)) {
				System.out.println("Ĭ��ֱ�ӽ��룬δʵ��");
				System.out.println("ϵͳ��¼�ɹ���");
				break;
			}
			else if("2".equals(choose)){
				System.out.println("x10ͼ�����ϵͳ���˳�����ӭ�´�ʹ�ã�");
				System.exit(0);
			}
			else {
				System.err.println("���벻�Ϸ���������ѡ��");
				
			}
		}
	}

}
