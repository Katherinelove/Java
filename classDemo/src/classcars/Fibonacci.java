package classcars;

import java.util.Scanner;

/**
 * ��������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��24�� ����4:53:59
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("������������и�����");
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
