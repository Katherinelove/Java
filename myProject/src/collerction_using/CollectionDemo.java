package collerction_using;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 集合中collection的子接口list，拥有比父类更健壮 的方法
 * 必须由实现类去实现接口
 * list为线性表    
 * @author 15281
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		//多态，以接口  操作子类对象
		List<String> list1=new ArrayList<>();
		//添加元素
		list1.add("鳄鱼");
		list1.add("鱼人 ");
		list1.add("辛德勒");
		list1.add("狗头");
		list1.add("猪妹");
		list1.add("瑞雯");
		list1.add("压缩");
		System.out.println(list1);
		//中间插入元素
		list1.add(1, "katherine");
		list1.add(4, "love");
		System.out.println(list1);
		
		//修改元素的值
		list1.set(1, "曾帅");
		
		//添加其他  同一父接口同一泛型的集合
		List<String> list2=new ArrayList<>();
		list2.add("姑姑");
		list2.add("过儿");
		list2.add("郭襄");
		list1.addAll(list2);
		System.out.println(list1);
		
		LinkedList<String> lList=new LinkedList<>();
		lList.add("love1");
		lList.add("haha");
		list1.addAll(lList);
		System.out.println("合并LinkList："+list1);
		
		//删除元素
		list1.remove(0);
		list1.remove("郭襄");
		System.out.println("删除元素之后："+list1);
		
		//获取子元素
		List<String> list4=list1.subList(2, 4);
		System.out.println("subList(2, 4)"+list4);
		
		//各种类型的遍历
		System.out.println("四种遍历集合方法 ：");
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
		//v3.0 迭代器   节约内存空间，一个一个读取（固定格式）
		
		Iterator<String> it=list1.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+", ");
		}
		System.out.println();
		
		//v4.0  增强版的迭代器
		 ListIterator<String> listIt=list1.listIterator();
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		System.out.println();
		
		
		//升级版的迭代器功能（与传统迭代器的区别）
		//1.0  不仅可以从前往后读取，也能从后往前读取
		//2.0能够修改集合中的元素
		ListIterator<String> listIt2=list1.listIterator(list1.size());
		while(listIt2.hasPrevious()){
			System.out.print(listIt2.previous()+", ");
		}
		System.out.println();
		
		
		//固定格式，先判断是否存在前面元素，再将指针向前移动，修改前一个元素色值
		ListIterator<String> listIt3=list1.listIterator(1);
		//迭代器修改内容之前，必须判断前面元素是否存在
		if(listIt3.hasPrevious()){
			listIt3.previous();
			listIt3.set("赵子龙");
		}
		System.out.println(list1);
		
		//自定义遍历方法
		System.out.println("自定义遍历接口：");
		show(list1.iterator());
	}
	
	
	
	//使用迭代器的好处，在遍历集合时，不依赖某个类的实习
	//传入迭代器，遍历集合，一个借口搞定
	public static void show(Iterator it1){
		while(it1.hasNext()){
			System.out.print(it1.next()+", ");
		}
	}
//	//eg：打印集合内容--只能重载方法，答应不同类型的线性表内容
//	public void	show(List<Student> student){}
//	public void	show(List<Teacher> teacher){}
}
class Employee{}
