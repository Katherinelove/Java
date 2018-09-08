package book_manager_V2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookViewDialogImpl extends AbstractBookView {
	private Scanner input=null;
	private BookBiz bookBiz=null;
	public BookViewDialogImpl() {
		input=new Scanner(System.in);
		bookBiz=new BookBiz();
	}
	
	
	@Override
	public void start() {
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

	@Override
	public int mainView() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>���˵�");
		System.out.println("1.����ͼ��\n2.ɾ��ͼ��"
				+ "\n3.�鿴����ͼ��\n4.��Ų���ͼ��\n"
				+ "5.ͼ�����\n6.ͼ�����\n7.�˳�");
		System.out.print("\n��ѡ��");
		int choose=input.nextInt();
		return choose;
	}

	@Override
	public void showAllBooks() {
		System.out.println("��ӭ����x10ͼ�����ϵͳ>>>�鿴ͼ���");
		bookBiz.showAllBook(Datas.bookStore);
	}

	@Override
	public void showOutStore() {
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

	@Override
	public void showInStore() {
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

	@Override
	public void showFindBookView() {
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

	@Override
	public void showDelBookView() {
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

	@Override
	public void showAddBookView() {
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

	@Override
	public void loginmenu() {
		String content="��ӭʹ��x10ͼ�����ϵͳ��\n";
		content+="=====================================\n";
		content+="1.��¼ϵͳ\\t2.�˳�ϵͳ\n";
		content+="=====================================\n";
		int[] choose1= {1,2};
		while(true) {
//			System.out.println("��ӭʹ��x10ͼ�����ϵͳ��");
//			System.out.println("=====================================");
//			System.out.println("1.��¼ϵͳ\t2.�˳�ϵͳ");
//			System.out.println("=====================================");
			JOptionPane.showConfirmDialog(null, content);
//			System.out.print("\n��ѡ��");
			Object obj1=JOptionPane.showInputDialog("��ѡ��");
			String choose=obj1.toString();
			if("1".equals(choose)) {
//				System.out.println("Ĭ��ֱ�ӽ��룬δʵ��");
//				System.out.println("ϵͳ��¼�ɹ���");
				JOptionPane.showMessageDialog(null, "Ĭ��ֱ�ӽ��룬δʵ��\tϵͳ��¼�ɹ�");
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
