package collecttion_using;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arraylist�÷�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��2�� ����10:07:01
 */
public class ArrayListUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList(20);
		collectiong(names);
		System.out.println("����������");
		printUpperCase(names);
		
	}

	private static void printUpperCase(ArrayList names) {
		// TODO Auto-generated method stub
		for(int i=0;i<names.size();i++) {
			String name=(String) names.get(i);
			System.out.println(name.toUpperCase());
		}
	}

	private static void collectiong(ArrayList names) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		while(true) {
			System.out.print("�ÿ����ƣ�");
			String name=console.next();
			if(name.equals("quit")) {
				break;
			}
			names.add(name);
		}
		
	}
	

}
