package collerction_using;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * ������collection���ӽӿ�list��ӵ�бȸ������׳ �ķ���
 * ������ʵ����ȥʵ�ֽӿ�
 * listΪ���Ա�    
 * @author 15281
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		//��̬���Խӿ�  �����������
		List<String> list1=new ArrayList<>();
		//���Ԫ��
		list1.add("����");
		list1.add("���� ");
		list1.add("������");
		list1.add("��ͷ");
		list1.add("����");
		list1.add("����");
		list1.add("ѹ��");
		System.out.println(list1);
		//�м����Ԫ��
		list1.add(1, "katherine");
		list1.add(4, "love");
		System.out.println(list1);
		
		//�޸�Ԫ�ص�ֵ
		list1.set(1, "��˧");
		
		//�������  ͬһ���ӿ�ͬһ���͵ļ���
		List<String> list2=new ArrayList<>();
		list2.add("�ù�");
		list2.add("����");
		list2.add("����");
		list1.addAll(list2);
		System.out.println(list1);
		
		LinkedList<String> lList=new LinkedList<>();
		lList.add("love1");
		lList.add("haha");
		list1.addAll(lList);
		System.out.println("�ϲ�LinkList��"+list1);
		
		//ɾ��Ԫ��
		list1.remove(0);
		list1.remove("����");
		System.out.println("ɾ��Ԫ��֮��"+list1);
		
		//��ȡ��Ԫ��
		List<String> list4=list1.subList(2, 4);
		System.out.println("subList(2, 4)"+list4);
		
		//�������͵ı���
		System.out.println("���ֱ������Ϸ��� ��");
		//v1.0
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+", ");
		}
		System.out.println();
		//v2.0
		for (String value : list1) {
			System.out.print(value+", ");
		}
		System.out.println();
		//v3.0 ������   ��Լ�ڴ�ռ䣬һ��һ����ȡ���̶���ʽ��
		
		Iterator<String> it=list1.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+", ");
		}
		System.out.println();
		
		//v4.0  ��ǿ��ĵ�����
		 ListIterator<String> listIt=list1.listIterator();
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		System.out.println();
		
		
		//������ĵ��������ܣ��봫ͳ������������
		//1.0  �������Դ�ǰ�����ȡ��Ҳ�ܴӺ���ǰ��ȡ
		//2.0�ܹ��޸ļ����е�Ԫ��
		ListIterator<String> listIt2=list1.listIterator(list1.size());
		while(listIt2.hasPrevious()){
			System.out.print(listIt2.previous()+", ");
		}
		System.out.println();
		
		
		//�̶���ʽ�����ж��Ƿ����ǰ��Ԫ�أ��ٽ�ָ����ǰ�ƶ����޸�ǰһ��Ԫ��ɫֵ
		ListIterator<String> listIt3=list1.listIterator(1);
		//�������޸�����֮ǰ�������ж�ǰ��Ԫ���Ƿ����
		if(listIt3.hasPrevious()){
			listIt3.previous();
			listIt3.set("������");
		}
		System.out.println(list1);
		
		//�Զ����������
		System.out.println("�Զ�������ӿڣ�");
		show(list1.iterator());
	}
	
	
	
	//ʹ�õ������ĺô����ڱ�������ʱ��������ĳ�����ʵϰ
	//������������������ϣ�һ����ڸ㶨
	public static void show(Iterator it1){
		while(it1.hasNext()){
			System.out.print(it1.next()+", ");
		}
	}
//	//eg����ӡ��������--ֻ�����ط�������Ӧ��ͬ���͵����Ա�����
//	public void	show(List<Student> student){}
//	public void	show(List<Teacher> teacher){}
}
class Employee{}
