package collecttion_using;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 利用arraydeque模拟
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月5日 下午4:44:41
 */
public class Stack {
	private Deque elems=new ArrayDeque();
	private int capacity;
	
	public Stack(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
	}
	
	Boolean push(Object elem) {
		if(elems.size()+1>capacity) {
			return false;
		}
		return elems.offerLast(elem);
	}
	
	public Object pop() {
		return elems.pollLast();
	}
	
	public Object peek() {
		return elems.peekLast();
	}
	public int size() {
		return elems.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack(5);
		stack.push("kate");
		stack.push("shuai");
		stack.push("love");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
