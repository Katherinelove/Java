package book_manager_V1;

/**
 * ͼ���� javabean �൱�����ݰ�
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��9��1�� ����6:52:28
 */
public class Book {
	private String bookId;
	private String bookName;
	private String isbn; // ͼ������
	private int bookCount; // ͼ������
	private double price;
	private String author;
	private String publisher; // ������

	public Book() {}
	public Book(String id,String bookName,int count) {
		setBookId(id);
		setBookName(bookName);
		setBookCount(count);
	}
	
	/**
	 *��ƶ���ȽϿ�����дequals()����
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj==null||!(obj instanceof Book)){
			return false;
		}
		//ǿ��ת����Book��
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
