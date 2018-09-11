package collerction_using;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayLst�ŵ㣺������������ʣ��������飩
 * LinkList�ŵ㣺�����ڲ��롢���ӡ�ɾ���Ȳ���
 * @author 15281
 *
 */
public class ArrayListAndLinkListDemo {

	public static void main(String[] args) {
		System.out.println("ArrayList��ʱ��"+costTime(new ArrayList<>()));
		System.out.println("LinkList��ʱ��"+costTime(new LinkedList<>()));
	}
	
	/**
	 * ��ʵ�ʿ��������У��п���������������ڣ�������ʺͲ���/ɾ�������������
	 * ����ʹ�ø���ӿ�List�����ù��ľ���ʵ��
	 * �پ��������£������ת������Ӧ�������ͽ���ʹ�ü��ɣ��ӿڶ�̬��
	 * @param list
	 * @return
	 */
	public static long costTime(List<Object> list){
		//��Ҫ��ӵĶ���
		Object obj=new Object();
		long startTime=System.currentTimeMillis();
		final int N=50000;
		for (int i = 0; i <N; i++) {
//			list.add(obj);  //���б�����Ԫ�ز�𲻴�
			list.add(0, obj);  //��0��Ԫ�ز������
		}
		long endTime=System.currentTimeMillis();
		return endTime-startTime;
	}
}
