package define_arraylist;

import java.util.Arrays;

/**
 * ����һ�������ֻ����ֶ��������Object����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����3:05:26
 */
public class ArrayList {
	private Object[] list;  //collected list
	private int index;       //index

	//��������ָ����ʼ����
	public ArrayList(int capacity) {
		//�в���ʱ��Object����������
		list=new Object[capacity];
	}
	public ArrayList() {
		// �޲�ʱĬ�ϳ���16
		this(16);
	}
	
	//�ռ�����
	public void add(Object ob) {
		//����Ӷ���ʱ�������ж�����ʱ������������copy�����ӳ���
		if(index==list.length) {
			//�������������������ӳ���Arrays.copyOf����
			list=Arrays.copyOf(list, list.length*2);
		}
//		list[next]=ob;
//		next++;
		//��++����д
		list[index++]=ob;
	}
	
	//��������ȡ����
	Object get(int index) {
		return list[index];
	}
	
	//��ȡ��ǰ���������
	int size() {
		return index;
	}
	//���¶���toString ��
	public String toString(){
		String str="";
		for (int i = 0; i <this.size(); i++) {
			str=str+this.get(i)+" ";
		}
		return str;
	}
	
	//���¶���equals����
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
