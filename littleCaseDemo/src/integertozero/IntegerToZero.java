package integertozero;
/**
 * ��Ǯ����
 */
import java.util.Scanner;

public class IntegerToZero {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��double��");
		double money=input.nextDouble();
		int yuan= (int)money;
		int tenCount=yuan/10;
		int fiveCount=yuan%10/5;
		int oneCount=yuan%10%5;
		int fiveJiaoCount=((int)(money*10))%10/5;
		int oneJiaoCount=((int)(money*10))%10%5;
		System.out.println(tenCount+"��10Ԫ"+fiveCount+"��5Ԫ"
				+oneCount+"��1Ԫ"+fiveJiaoCount+"��5��"+oneJiaoCount
				+"��1��");
	}
}
