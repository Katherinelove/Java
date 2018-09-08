package book_manager_V2;
import javax.print.attribute.ResolutionSyntax;
import book_manager_V2.Datas;



/**
 * ͼ��ҵ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��1�� ����7:04:27
 */
public class BookBiz {
	//�������ܣ�ÿ�α����ȡ���ݿ���������������
	/**
	 * ��ȡ���ݿ���ͼ�������
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
	//Ϊ�˿��Ի�ȡ��������ĳ��ȣ���Ҫд�����ڲ����޸��������������£�����
	public int getCount(Book ...bookArray) {
		int count=0;
		for(int i=0;i<bookArray.length;i++) {
			if(bookArray[i]!=null) {
				count++;
			}
		}
		return count;	
	}

	//����չʾ
	//1.���ͼ��
	public boolean addBook(Book book) {
		//�ж������ݿ��Ƿ�����
		if(getCount()==Datas.bookStore.length) {
			System.out.println("ͼ���������");
			return false;
		}
		Datas.bookStore[getCount()]=book;
		return true;
	}
	//2.ɾ��ͼ��
	public boolean delBook(Book book) {
		//ͼ����������һ��  �����Ķ�
		int bookCount=getCount();
		//Ѱ��Ҫɾ�����±�
		int index=-1;
		for(int i=0;i<bookCount;i++) {
			//ʹ����д����
			if(book.equals(Datas.bookStore[i])) {
				index=i;
				break;
			}
		}
		//��ͼ������鳤����ɾ��
		for(int i=index;i<bookCount;i++) {
			Datas.bookStore[i]=Datas.bookStore[i+1];
		}
		//ɾ�����һ������
		Datas.bookStore[bookCount-1]=null;
		return true;
	}
	//3.����ͼ��
	/**
	 * �ҵ�ͼ�鷵�أ�û���ҵ����ؿ�
	 * @param bookId
	 * @return
	 */
	public Book findBook(String bookId) {
		//��¼Ѱ�ҵ����±�
//		int index=-1;
		for(int i=0;i<getCount();i++) {
			if(bookId.equals(Datas.bookStore[i].getBookId())) {
				return Datas.bookStore[i];
			}
		}
		return null;
	}	
	//4.���(����ͼ��)
	public boolean inStore(String id,int bookCount) {
		Book book=findBook(id);
		if(null==book) {
			return false; 
		}
		book.setBookCount(book.getBookCount()+bookCount);
		return true;
	}
	//5.����
	public boolean outStore(String bookId,int bookCount) {
		Book book=findBook(bookId);
		if(null==book) {
			return false;
		}
		if(book.getBookCount()<bookCount) {
			System.out.println("��治�㣡");
			return false;
		}
		
		book.setBookCount(book.getBookCount()-bookCount);
		return true;
	}
	
	
	//6.��ʾͼ��(�����ض������飬��Ҫд��)
//	public void showAllBook(Book ...bookArray) {
//		System.out.println("ͼ��id\t\tͼ������\t\tͼ����");
//		for (int i = 0; i < getCount(); i++) {
//			System.out.println(bookArray[i].getBookId()+"\t\t"+
//		Datas.bookStore[i].getBookName()+"\t\t"+
//		bookArray[i].getBookCount());
//		}
//	}
//	
	//���·���   �����������Ϊnullʱ Ĭ��ΪDatas.bookStore[]����
	public void showAllBook(Book ...bookArray) {
		if(bookArray==null) {
			bookArray=Datas.bookStore;
		}
		System.out.println("ͼ��id\t\tͼ������\t\tͼ����");
		for (int i = 0; i < getCount(); i++) {
			System.out.println(bookArray[i].getBookId()+"\t\t"+
					bookArray[i].getBookName()+"\t\t"+
		bookArray[i].getBookCount());
		}
	}
	
	
}
