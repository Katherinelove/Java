package calculate_avg;

import java.util.Scanner;

/**
 * 循环三次输入求平均值
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月12日 下午9:20:14
 */
public class CalcAvgPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i;
		double power=-1,sum=0;
		for(i=0;i<3;i++) {
			System.out.print("请输入第"+(i+1)+"位玩家战斗力：");
			power=input.nextDouble();
			sum+=power;	
		}
		System.out.println((i)+"玩家的平均值为"+sum/i);
		

	}

}
