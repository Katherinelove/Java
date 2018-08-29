package try_catch;

import java.util.Scanner;

/**
 * 异常处理,利用异常恢复异常
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月29日 上午9:46:35
 */
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double sum=0;
		int	count=0;
		while(true) {
			try {
			System.out.print("请输入一个整数：");
			double num=input.nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
			count++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.printf("略过非整数输入：%s%n",input.next());
			}

		}
		System.out.printf("输入的数平均值为%.2f",sum/count);

	}

}
