package calculate_avg;

import java.util.Scanner;

/**
 * ѭ������������ƽ��ֵ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��12�� ����9:20:14
 */
public class CalcAvgPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i;
		double power=-1,sum=0;
		for(i=0;i<3;i++) {
			System.out.print("�������"+(i+1)+"λ���ս������");
			power=input.nextDouble();
			sum+=power;	
		}
		System.out.println((i)+"��ҵ�ƽ��ֵΪ"+sum/i);
		

	}

}
