package if_test;

import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������̷���A-Z����");
		char ch=input.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("�����̷���ȷ��");
		}
			else{
				System.err.println("�������");
		}
	}

}
