package book_manager_V2;

public class Test {

	public static void main(String[] args) {
//		BookView bookView=new BookView();
//		AbstractBookView bookViewConImpl=new BookViewConsoleImpl();
//		bookViewConImpl.loginmenu();
//		AbstractBookView bookViewDiagImpl=new BookViewDialogImpl();
//		bookViewDiagImpl.loginmenu();
//		FileUtil.saveBook(Datas.bookStore);
		Book[] bookArray=FileUtil.loadBook();
		new BookBiz().showAllBook(bookArray);
	}

}
