package integertozero;
/**
 * 整钱换零
 */
import java.util.Scanner;

public class IntegerToZero {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个double：");
		double money=input.nextDouble();
		int yuan= (int)money;
		int tenCount=yuan/10;
		int fiveCount=yuan%10/5;
		int oneCount=yuan%10%5;
		int fiveJiaoCount=((int)(money*10))%10/5;
		int oneJiaoCount=((int)(money*10))%10%5;
		System.out.println(tenCount+"个10元"+fiveCount+"个5元"
				+oneCount+"个1元"+fiveJiaoCount+"个5角"+oneJiaoCount
				+"个1角");
	}
}
