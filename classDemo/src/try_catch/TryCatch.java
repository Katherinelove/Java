package try_catch;

import java.util.Scanner;

/**
 * �쳣����,�����쳣�ָ��쳣
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��29�� ����9:46:35
 */
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double sum=0;
		int	count=0;
		while(true) {
			try {
			System.out.print("������һ��������");
			double num=input.nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
			count++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.printf("�Թ����������룺%s%n",input.next());
			}

		}
		System.out.printf("�������ƽ��ֵΪ%.2f",sum/count);

	}

}
