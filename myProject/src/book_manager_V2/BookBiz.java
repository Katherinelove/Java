package book_manager_V2;
import javax.print.attribute.ResolutionSyntax;
import book_manager_V2.Datas;



/**
 * 图书业务类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月1日 下午7:04:27
 */
public class BookBiz {
	//基础功能，每次必须获取数据库数组数量，即下
	/**
	 * 获取数据库中图书的数量
	 * @return
	 */
	public int getCount() {
		int count=0;
		for(int i=0;i<Datas.bookStore.length;i++) {
			if(Datas.bookStore[i]!=null) {
				count++;
			}
		}
		return count;	
	}
	//为了可以获取其他数组的长度，不要写死，在不想修改其他代码的情况下，重载
	public int getCount(Book ...bookArray) {
		int count=0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i]!=null) {
				count++;
			}
		}
		return count;	
	}

	//功能展示
	//1.添加图书
	public boolean addBook(Book book) {
		//判断是数据库是否已满
		if(getCount()==Datas.bookStore.length) {
			System.out.println("图书库已满！");
			return false;
		}
		Datas.bookStore[getCount()]=book;
		return true;
	}
	//2.删除图书
	public boolean delBook(Book book) {
		//图书数量接收一下  方便阅读
		int bookCount=getCount();
		//寻找要删除的下标
		int index=-1;
		for(int i=0;i<bookCount;i++) {
			//使用重写方法
			if(book.equals(Datas.bookStore[i])) {
				index=i;
				break;
			}
		}
		//在图书的数组长度中删除
		for(int i=index;i<bookCount;i++) {
			Datas.bookStore[i]=Datas.bookStore[i+1];
		}
		//删除最后一个对象
		Datas.bookStore[bookCount-1]=null;
		return true;
	}
	//3.查找图书
	/**
	 * 找到图书返回，没有找到返回空
	 * @param bookId
	 * @return
	 */
	public Book findBook(String bookId) {
		//记录寻找到的下标
//		int index=-1;
		for(int i=0;i<getCount();i++) {
			if(bookId.equals(Datas.bookStore[i].getBookId())) {
				return Datas.bookStore[i];
			}
		}
		return null;
	}	
	//4.入库(已有图书)
	public boolean inStore(String id,int bookCount) {
		Book book=findBook(id);
		if(null==book) {
			return false; 
		}
		book.setBookCount(book.getBookCount()+bookCount);
		return true;
	}
	//5.出库
	public boolean outStore(String bookId,int bookCount) {
		Book book=findBook(bookId);
		if(null==book) {
			return false;
		}
		if(book.getBookCount()<bookCount) {
			System.out.println("库存不足！");
			return false;
		}
		
		book.setBookCount(book.getBookCount()-bookCount);
		return true;
	}
	
	
	//6.显示图书(不是特定的数组，不要写死)
//	public void showAllBook(Book ...bookArray) {
//		System.out.println("图书id\t\t图书名称\t\t图书库存");
//		for (int i = 0; i < getCount(); i++) {
//			System.out.println(bookArray[i].getBookId()+"\t\t"+
//		Datas.bookStore[i].getBookName()+"\t\t"+
//		bookArray[i].getBookCount());
//		}
//	}
//	
	//更新方法   当输入的数组为null时 默认为Datas.bookStore[]数组
	public void showAllBook(Book ...bookArray) {
		if(bookArray==null) {
			bookArray=Datas.bookStore;
		}
		System.out.println("图书id\t\t图书名称\t\t图书库存");
		for (int i = 0; i < getCount(); i++) {
			System.out.println(bookArray[i].getBookId()+"\t\t"+
					bookArray[i].getBookName()+"\t\t"+
		bookArray[i].getBookCount());
		}
	}
	
	
}
