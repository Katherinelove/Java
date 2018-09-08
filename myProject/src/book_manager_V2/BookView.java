package book_manager_V2;
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
		loginmenu();
//		end();
	}
	

	private void start() {
		// ����ϵͳ��չʾ�˵�
		while(true) {
			showMainView();
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
				+ "\n3.�鿴����ͼ��\n4.��Ų���ͼ��\n"
				+ "5.ͼ�����\n6.ͼ�����\n7.�˳�");
		System.out.print("\n��ѡ��");
		int choose=input.nextInt();
		switch (choose) {
		case 1:
			//����ͼ��
			showAddBookView();
			break;
		case 2:
			//ɾ��ͼ��
			showDelBookView();
			break;
		case 3:
			//�鿴����ͼ��
			System.out.println("��ӭ����x10ͼ�����ϵͳ>>>�鿴ͼ���");
			bookBiz.showAllBook(Datas.bookStore);
			break;
		case 4:
			//ͨ��id����ͼ��
			showFindBookView();
			break;
		case 5:
			//5.ͼ�����
			showInStore();
			break;
		case 6:
			//6.ͼ�����
			showOutStore();
			break;
		case 7:
			//�˳�����
			System.out.println("������һ���˵���");
			showMainView();
			break;
		default:
			System.out.println("���벻�Ϸ�,���������룡");
			showMainView();
			break;
		}
	}
	private void showOutStore() {
		// ������ͼ
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>ͼ�����");
		System.out.print("����������ͼ��id��");
		String bookId=input.next();
		System.out.print("���������ͼ���������");
		int bookCount=input.nextInt();
		if(bookBiz.outStore(bookId, bookCount)) {
			System.out.println("����ɹ���");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("����ʧ�ܣ�û���ҵ����ͼ���ͼ���������㣡");
			System.out.print("�Ƿ�������г��������Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("�Ѿ��˳����������");
				//�������˵�
				showMainView();
			}else if(choose.charAt(0)=='Y') {
				showOutStore();
			}
		}
	}

	private void showInStore() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>ͼ���˿�");
		System.out.print("���������ͼ��id��");
		String bookId=input.next();
		System.out.print("���������ͼ���������");
		int bookCount=input.nextInt();
		if(bookBiz.inStore(bookId, bookCount)) {
			System.out.println("���ɹ���");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("���ʧ�ܣ�û���ҵ����ͼ�飡");
			System.out.print("�Ƿ����������������Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("�Ѿ��˳���������");
				//�������˵�
				showMainView();
				
			}else if(choose.charAt(0)=='Y') {
				showInStore() ;
			}

		}
	}

	private void showFindBookView() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>ͼ�����");
		System.out.print("�������ѯ���id��");
		String bookId=input.next();
		Book book=bookBiz.findBook(bookId);
		if(book!=null) {
			bookBiz.showAllBook(book);
			System.out.println("����ͼ��ɹ���");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("����ͼ��ʧ�ܣ�����ͼ��id��");
		}
	}

	private void showDelBookView() {
		// ɾ��ͼ��
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>ɾ��ͼ��");
		System.out.print("������Ҫ���ͼ���id��");
		String bookId=input.next();
		//����find��������
		Book book=bookBiz.findBook(bookId);
		if(book==null) {
			//û���ҵ�ͼ��
			System.out.println("sorry,û����Ҫɾ����ͼ�飡");
			System.out.println("����������:");
			showDelBookView();
			System.out.println("ɾ��ͼ��"+book.getBookName()+"�ɹ���");
			//�ɹ�֮��  ��ӡ�˵���
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			bookBiz.delBook(book);
			System.out.println("ɾ��ͼ�飺"+book.getBookName()+"�ɹ���");
		}	
	}

	private void showAddBookView() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>���ͼ��");
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
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			//��ʾͼ���Ѿ�����
			System.out.println("¼��ͼ��id�Ѿ����ڣ�������¼�룺");
			//�ݹ����
			showAddBookView();
		}
	}

	private void loginmenu() {	
		while(true) {
			System.out.println("��ӭʹ��x10ͼ�����ϵͳ��");
			System.out.println("=====================================");
			System.out.println("1.��¼ϵͳ\t2.�˳�ϵͳ");
			System.out.println("=====================================");
			System.out.print("\n��ѡ��");
			String choose=input.next();
			if("1".equals(choose)) {
				System.out.println("Ĭ��ֱ�ӽ��룬δʵ��");
				System.out.println("ϵͳ��¼�ɹ���");
				//����ϵͳ  ��ʼ�˵�
				start();
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
