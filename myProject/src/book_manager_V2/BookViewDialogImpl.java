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
		// 进入系统后展示菜单
		while(true) {
			showMainView();
			System.out.print("是否继续进行操作？Y/N：");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.out.println("X10图书管理系统已经退出，欢迎下次使用！");
				System.exit(0);
			}else if(choose.charAt(0)=='Y'){
				showMainView();
			}
			else {
				System.out.println("输入不合法！请重新选择：");
			}
		}
	}

	@Override
	public int mainView() {
		System.out.println("欢迎来到x10图书管理系统>>>主菜单");
		System.out.println("1.新增图书\n2.删除图书"
				+ "\n3.查看所有图书\n4.编号查找图书\n"
				+ "5.图书入库\n6.图书出库\n7.退出");
		System.out.print("\n请选择：");
		int choose=input.nextInt();
		return choose;
	}

	@Override
	public void showAllBooks() {
		System.out.println("欢迎来到x10图书管理系统>>>查看图书库");
		bookBiz.showAllBook(Datas.bookStore);
	}

	@Override
	public void showOutStore() {
		// 出库视图
		System.out.println("欢迎来到x10图书管理系统>>>图书出库");
		System.out.print("请输入出库库图书id：");
		String bookId=input.next();
		System.out.print("请输入出库图书的数量：");
		int bookCount=input.nextInt();
		if(bookBiz.outStore(bookId, bookCount)) {
			System.out.println("出库成功！");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("出库失败！没有找到入库图书或图书数量不足！");
			System.out.print("是否继续进行出库操作？Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("已经退出出库操作！");
				//返回主菜单
				showMainView();
			}else if(choose.charAt(0)=='Y') {
				showOutStore();
			}
		}
	}

	@Override
	public void showInStore() {
		System.out.println("欢迎来到x10图书管理系统>>>图书人库");
		System.out.print("请输入入库图书id：");
		String bookId=input.next();
		System.out.print("请输入入库图书的数量：");
		int bookCount=input.nextInt();
		if(bookBiz.inStore(bookId, bookCount)) {
			System.out.println("入库成功！");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("入库失败！没有找到入库图书！");
			System.out.print("是否继续进行入库操作？Y/N:");
			String choose=input.next().toUpperCase();
			if(choose.charAt(0)=='N') {
				System.err.println("已经退出入库操作！");
				//返回主菜单
				showMainView();
				
			}else if(choose.charAt(0)=='Y') {
				showInStore() ;
			}
		}
	}

	@Override
	public void showFindBookView() {
		System.out.println("欢迎来到x10图书管理系统>>>图书查找");
		System.out.print("请输入查询书的id：");
		String bookId=input.next();
		Book book=bookBiz.findBook(bookId);
		if(book!=null) {
			bookBiz.showAllBook(book);
			System.out.println("查找图书成功！");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			System.out.println("查找图书失败，请检查图书id！");
		}
	}

	@Override
	public void showDelBookView() {
		// 删除图书
		System.out.println("欢迎来到x10图书管理系统>>>删除图书");
		System.out.print("请输入要输出图书的id：");
		String bookId=input.next();
		//利用find方法查找
		Book book=bookBiz.findBook(bookId);
		if(book==null) {
			//没有找到图书
			System.out.println("sorry,没有你要删除的图书！");
			System.out.println("请重新输入:");
			showDelBookView();
			System.out.println("删除图书"+book.getBookName()+"成功！");
			//成功之后  打印菜单！
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			bookBiz.delBook(book);
			System.out.println("删除图书："+book.getBookName()+"成功！");
		}	
	}

	@Override
	public void showAddBookView() {
		System.out.println("欢迎来到x10图书管理系统>>>添加图书");
		//必须判断图书编号是否存在再录入（可以在可以添加Book时实例化，节约空间）
		System.out.print("请输入图书编号：");
		String bookId=input.next();
		Book book=bookBiz.findBook(bookId);
		if(book==null) {
			//没有找到,对象为空 实例化
			book=new Book();
			book.setBookId(bookId);
			System.out.print("请输入图书名称：");
			book.setBookName(input.next());
			System.out.print("请输入添加图书的库存：");
			book.setBookCount(input.nextInt());
			
			//*****
			bookBiz.addBook(book);
			System.out.println("添加图书成功！");
			bookBiz.showAllBook(Datas.bookStore);
		}else {
			//表示图书已经存在
			System.out.println("录入图书id已经存在，请重新录入：");
			//递归调用
			showAddBookView();
		}
	}

	@Override
	public void loginmenu() {
		String content="欢迎使用x10图书管理系统：\n";
		content+="=====================================\n";
		content+="1.登录系统\\t2.退出系统\n";
		content+="=====================================\n";
		int[] choose1= {1,2};
		while(true) {
//			System.out.println("欢迎使用x10图书管理系统：");
//			System.out.println("=====================================");
//			System.out.println("1.登录系统\t2.退出系统");
//			System.out.println("=====================================");
			JOptionPane.showConfirmDialog(null, content);
//			System.out.print("\n请选择：");
			Object obj1=JOptionPane.showInputDialog("请选择：");
			String choose=obj1.toString();
			if("1".equals(choose)) {
//				System.out.println("默认直接进入，未实现");
//				System.out.println("系统登录成功！");
				JOptionPane.showMessageDialog(null, "默认直接进入，未实现\t系统登录成功");
				//进入系统  开始菜单
				start();
			}
			else if("2".equals(choose)){
				System.out.println("x10图书管理系统已退出，欢迎下次使用！");
				System.exit(0);
			}
			else {
				System.err.println("输入不合法！请重新选择：");
			}
		}
	}	
}
