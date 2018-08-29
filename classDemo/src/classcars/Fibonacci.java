package classcars;

import java.util.Scanner;

/**
 * 费氏数列
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月24日 下午4:53:59
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入费氏数列个数：");
		int count=input.nextInt();;
		
		int F1=1,F2=1,F=0;
		if(count==1) {
			System.out.println(F1);
		}
		if(count==2) {
			System.out.println(F1+" "+F2);
		}
		if(count>2) {
			for(int i=0;i<count;i++) {
				F=F1+F2 ;
				System.out.println(F);
			}
			
		}
		
	}

}
