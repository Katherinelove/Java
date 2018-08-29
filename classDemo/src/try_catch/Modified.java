package try_catch;

import java.util.Scanner;

/**
 * 自定义函数nextInt（），只准输入数字
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月29日 上午10:38:22
 */
public class Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int	count=0;
		while(true) {
			System.out.print("请输入一个整数：");
			double num=nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
			count++;
		}

		System.out.printf("输入的数平均值为%.2f",sum/count);

	}
	
	
	static Scanner input=new Scanner(System.in);
	static int nextInt() {
		String num=input.next();
		//"\\d*"表示不是数字，string.matches()表示从字符串中匹配
		while(!num.matches("\\d*")) {
			System.out.print("请输入数字：");
			num=input.next();
		}
		return Integer.parseInt(num);//剖析成整数
	}

}
