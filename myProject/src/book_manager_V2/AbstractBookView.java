package book_manager_V2;
import java.awt.SystemColor;
import java.util.Scanner;
import javax.swing.text.Position.Bias;

/**
 * Ϊ�˲�ͬƽ̨�Ŀ��ӻ�����д�ɳ�����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��1�� ����8:43:26
 */
public abstract class AbstractBookView {
	public AbstractBookView() {
		//Ϊʲô���ܽ���¼������ڹ��������棬������������Ϊ�յĴ���
		//����ʵ����ʱ���ȵ��ø���Ĺ�������ֱ��ִ��loginmenu();
		//Ȼ��input���������еĹ�������ʵ��������û��ִ�У�����inputΪnull��
		//�������ڲ�һ��
//		loginmenu();
	}
	
	public abstract void start();

	public abstract int mainView();
	public void showMainView() {
		int choose=mainView();
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
			showAllBooks();
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
//			System.out.println("������һ���˵���");
			showMainView();
			break;
		default:
//			System.out.println("���벻�Ϸ�,���������룡");
			showMainView();
			break;
		}
	}

	public abstract void showAllBooks();
	
	public abstract void showOutStore();

	public abstract void showInStore();

	public abstract void showFindBookView();

	public abstract void showDelBookView();

	public abstract void showAddBookView();

	public abstract void loginmenu();
}