package classcars;

import java.util.Scanner;

/**
 * ��ӡ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��25�� ����4:01:42
 */
public class LingXing {

	public static void main(String[] args) {
		// TODO Auto-generate d method stub
		Scanner input=new Scanner(System.in);
//		System.out.print("please input ���� rows:");
//		int row=input.nextInt();
//		int adsRow=(row+1)/2;
		for(int i=-2;i<=2;i++) {
			if(i<0) {
				for(int j=1;j<=-i;j++) {
					System.out.print(" ");
					}
					for(int j=1;j<=(5+2*i);j++) {
						System.out.print("*");
						}
					}
			else {
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
					}
					for(int j=1;j<=(5-2*i);j++) {
						System.out.print("*");
						}
					}
			System.out.println();
		}
	}

}
