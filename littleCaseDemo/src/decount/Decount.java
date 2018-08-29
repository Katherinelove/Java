package decount;

import java.util.Scanner;

/**
 * Decount  打折
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月5日 下午2:32:01
 */
public class Decount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		double price,zhekou,total=0;
		int amount;
		System.out.print("输入商品1的单价：");
		price=input.nextDouble();
		System.out.print("输入商品1的数量：");
		amount=input.nextInt();
		total+=price*amount;
		
		System.out.print("输入商品2的单价：");
		price=input.nextDouble();
		System.out.print("输入商品2的数量：");
		amount=input.nextInt();
		total+=price*amount;
		
		if(total>200)
			zhekou=0.7;
		else
			zhekou=0.9;
		System.out.printf("总金额%.1f折后价为%.1f",total,total*zhekou);
	}

}
