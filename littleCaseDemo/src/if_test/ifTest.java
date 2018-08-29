package if_test;

import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÅÌ·û¡¾A-Z¡¿£º");
		char ch=input.next().charAt(0);
		if(ch>='A'&&ch<='Z') {
			System.out.println("ÊäÈëÅÌ·ûÕýÈ·£¡");
		}
			else{
				System.err.println("ÊäÈë´íÎó£¡");
		}
	}

}
