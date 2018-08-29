package collecttion_using;
/**
 * 简单链表
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月5日 下午3:03:54
 */
public class LinkedListUsing {
	//将收集 的对象用Node封装
	private class Node{
		Object o;
		Node next;
		
		public Node(Object o) {
			// TODO Auto-generated constructor stub
			this.o=o;
		}
	}
	
	private Node first;
	
	
	//新增Node封装对象，并有上一个Node的next参考
	public void add(Object elem) {
		Node node=new Node(elem);
		if(first==null) {
			first=node;
		}
		else {
			append(node);
		}
	}


	private void append(Node node) {
		// TODO Auto-generated method stub
		Node last=first;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=node;
	}
	
	//访问Node并计数以取得长度
	public int size() {
		int count=0;
		Node last=first;
		while(last!=null) {
			last=last.next;
			count++;
		}
		return count;
	}
	
	public Object get(int index) {
		checkSize(index);
		return findElenOf(index);
	}


	private Object findElenOf(int index) {
		// TODO Auto-generated method stub
		int count=0;
		Node last=first;
		while(count<index) {
			last=last.next;
			count++;
		}
		return last.o;
	}


	private void checkSize(int index) throws IndexOutOfBoundsException{
		// TODO Auto-generated method stub
		int size=size();
		if(index>=size) {
			throw new IndexOutOfBoundsException(
					String.format("Index :%d,Size :%d",index,size));
		}
		
	}
	
}
