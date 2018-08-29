package define_arraylist;

import java.util.Arrays;

/**
 * 创建一个用于手机各种对象的数组Object【】
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午3:05:26
 */
public class ArrayList {
	private Object[] list;  //collected list
	private int index;       //index

	//构造器中指定初始容量
	public ArrayList(int capacity) {
		//有参数时的Object【】的容量
		list=new Object[capacity];
	}
	public ArrayList() {
		// 无参时默认长度16
		this(16);
	}
	
	//收集对象
	public void add(Object ob) {
		//在添加对象时，必须判断数组时候已满，满了copy再增加长度
		if(index==list.length) {
			//数组已满，复制再增加长度Arrays.copyOf（）
			list=Arrays.copyOf(list, list.length*2);
		}
//		list[next]=ob;
//		next++;
		//后++，简写
		list[index++]=ob;
	}
	
	//根据索引取对象
	Object get(int index) {
		return list[index];
	}
	
	//获取当前数组的容量
	int size() {
		return index;
	}
	//重新定义toString 简化
	public String toString(){
		String str="";
		for (int i = 0; i <this.size(); i++) {
			str=str+this.get(i)+" ";
		}
		return str;
	}
	
	//重新定义equals（）
	public boolean equlas(Object other) {
		if(!(other instanceof ArrayList)){
			return false;
		}
		ArrayList arrayList=(ArrayList) other;
		if(arrayList.size()!=this.size()) {
			return false;
		}
		for (int i = 0; i < this.size(); i++) {
			if(!(this.get(i).equals(arrayList.get(i)))) {
				return false;
			}
		}

		return true;
	}
}
