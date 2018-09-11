package collerction_using;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 早起版本的java1.0之前  与ArrayList为表兄弟，用法大同小异
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年9月11日 下午4:02:03
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vec =new Vector<>();
		
		//添加元素
		vec.add("曾帅");
		vec.add("狗头");
		vec.add("鱼儿");
		vec.add("鳄鱼");
		vec.add("曾帅");
		vec.add("曾帅");
		vec.add("曾帅");
		vec.add("曾帅");
		vec.add("曾帅");
		vec.addElement("love");
		//均为增加，只是返回值不同
		
		//访问元素
		System.out.println("访问元素：");
		System.out.println(vec.get(2));
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.elementAt(2));
		
		
		//默认容量，为10；当超过容量时，以1倍增加
		System.out.println("vec.size："+vec.size());
		System.out.println("vec.capacity："+vec.capacity());
		vec.add("哈哈");
		System.out.println("vec.size："+vec.size());
		System.out.println("vec.capacity："+vec.capacity());
		
		//设置初四容量
		vec.ensureCapacity(100);
		System.out.println("设置初始容量后："+vec.capacity());
		
		//去除多余容量  是的size与capacity相等
		vec.trimToSize();
		System.out.println("vec.size："+vec.size());
		System.out.println("vec.capacity："+vec.capacity());
		
		//遍历   古老方法--枚举法（Iterator的前生）
		Enumeration<String> enum1=vec.elements();
		while(enum1.hasMoreElements()) {
			System.out.print(enum1.nextElement()+", ");
		}
		System.out.println();

		//使用匿名函数lambda 遍历
		System.out.println("使用Lambda遍历：");
		vec.forEach(str -> System.out.print(str+", "));
		System.out.println();
		
		//删除
		vec.removeElementAt(0);
		System.out.println(vec);
	}

}
