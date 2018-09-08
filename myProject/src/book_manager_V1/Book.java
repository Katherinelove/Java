package book_manager_V1;

/**
 * 图书类 javabean 相当于数据包
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年9月1日 下午6:52:28
 */
public class Book {
	private String bookId;
	private String bookName;
	private String isbn; // 图书出版号
	private int bookCount; // 图书数量
	private double price;
	private String author;
	private String publisher; // 出版社

	public Book() {}
	public Book(String id,String bookName,int count) {
		setBookId(id);
		setBookName(bookName);
		setBookCount(count);
	}
	
	/**
	 *设计对象比较可以重写equals()方法
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Book)){
			return false;
		}
		//强制转换成Book类
		Book book=(Book) obj;
		return this.getBookId().equals(book.getBookId());
	}
	
	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
