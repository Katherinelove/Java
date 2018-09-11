package collerction_using;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayLst优点：有利于随机访问（遍历数组）
 * LinkList优点：有利于插入、增加、删除等操作
 * @author 15281
 *
 */
public class ArrayListAndLinkListDemo {

	public static void main(String[] args) {
		System.out.println("ArrayList用时："+costTime(new ArrayList<>()));
		System.out.println("LinkList用时："+costTime(new LinkedList<>()));
	}
	
	/**
	 * 在实际开发过程中，有可能两种情况都存在（随机访问和插入/删除），交替出现
	 * 建议使用父类接口List，不用关心具体实现
	 * 再具体的情况下，传入或转换成相应的子类型进行使用即可（接口多态）
	 * @param list
	 * @return
	 */
	public static long costTime(List<Object> list){
		//需要添加的对象
		Object obj=new Object();
		long startTime=System.currentTimeMillis();
		final int N=50000;
		for (int i = 0; i <N; i++) {
//			list.add(obj);  //在列表最后加元素差别不大
			list.add(0, obj);  //在0号元素插入对象
		}
		long endTime=System.currentTimeMillis();
		return endTime-startTime;
	}
}
