package book_manager_V2;
import java.awt.SystemColor;
import java.util.Scanner;
import javax.swing.text.Position.Bias;

/**
 * 为了不同平台的可视化，这写成抽象父类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月1日 下午8:43:26
 */
public abstract class AbstractBookView {
	public AbstractBookView() {
		//为什么不能讲登录界面放在构造器里面，出现子类输入为空的错误
		//子类实例化时，先调用父类的构造器，直接执行loginmenu();
		//然而input是子子类中的构造器中实例化，并没有执行，所以input为null；
		//生命周期不一样
//		loginmenu();
	}
	
	public abstract void start();

	public abstract int mainView();
	public void showMainView() {
		int choose=mainView();
		switch (choose) {
		case 1:
			//新增图书
			showAddBookView();
			break;
		case 2:
			//删除图书
			showDelBookView();
			break;
		case 3:
			//查看所有图书
			showAllBooks();
			break;
		case 4:
			//通过id查找图书
			showFindBookView();
			break;
		case 5:
			//5.图书入库
			showInStore();
			break;
		case 6:
			//6.图书出库
			showOutStore();
			break;
		case 7:
			//退出程序
//			System.out.println("返回上一级菜单！");
			showMainView();
			break;
		default:
//			System.out.println("输入不合法,请重新输入！");
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