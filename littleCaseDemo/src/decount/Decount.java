package decount;

import java.util.Scanner;

/**
 * Decount  ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��5�� ����2:32:01
 */
public class Decount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		double price,zhekou,total=0;
		int amount;
		System.out.print("������Ʒ1�ĵ��ۣ�");
		price=input.nextDouble();
		System.out.print("������Ʒ1��������");
		amount=input.nextInt();
		total+=price*amount;
		
		System.out.print("������Ʒ2�ĵ��ۣ�");
		price=input.nextDouble();
		System.out.print("������Ʒ2��������");
		amount=input.nextInt();
		total+=price*amount;
		
		if(total>200)
			zhekou=0.7;
		else
			zhekou=0.9;
		System.out.printf("�ܽ��%.1f�ۺ��Ϊ%.1f",total,total*zhekou);
	}

}
