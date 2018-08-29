package collecttion_using;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arraylist用法
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月2日 上午10:07:01
 */
public class ArrayListUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList(20);
		collectiong(names);
		System.out.println("访问名单：");
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
			System.out.print("访客名称：");
			String name=console.next();
			if(name.equals("quit")) {
				break;
			}
			names.add(name);
		}
		
	}
	

}
