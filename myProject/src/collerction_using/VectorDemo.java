package collerction_using;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ����汾��java1.0֮ǰ  ��ArrayListΪ���ֵܣ��÷���ͬС��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��9��11�� ����4:02:03
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vec =new Vector<>();
		
		//���Ԫ��
		vec.add("��˧");
		vec.add("��ͷ");
		vec.add("���");
		vec.add("����");
		vec.add("��˧");
		vec.add("��˧");
		vec.add("��˧");
		vec.add("��˧");
		vec.add("��˧");
		vec.addElement("love");
		//��Ϊ���ӣ�ֻ�Ƿ���ֵ��ͬ
		
		//����Ԫ��
		System.out.println("����Ԫ�أ�");
		System.out.println(vec.get(2));
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.elementAt(2));
		
		
		//Ĭ��������Ϊ10������������ʱ����1������
		System.out.println("vec.size��"+vec.size());
		System.out.println("vec.capacity��"+vec.capacity());
		vec.add("����");
		System.out.println("vec.size��"+vec.size());
		System.out.println("vec.capacity��"+vec.capacity());
		
		//���ó�������
		vec.ensureCapacity(100);
		System.out.println("���ó�ʼ������"+vec.capacity());
		
		//ȥ����������  �ǵ�size��capacity���
		vec.trimToSize();
		System.out.println("vec.size��"+vec.size());
		System.out.println("vec.capacity��"+vec.capacity());
		
		//����   ���Ϸ���--ö�ٷ���Iterator��ǰ����
		Enumeration<String> enum1=vec.elements();
		while(enum1.hasMoreElements()) {
			System.out.print(enum1.nextElement()+", ");
		}
		System.out.println();

		//ʹ����������lambda ����
		System.out.println("ʹ��Lambda������");
		vec.forEach(str -> System.out.print(str+", "));
		System.out.println();
		
		//ɾ��
		vec.removeElementAt(0);
		System.out.println(vec);
	}

}
