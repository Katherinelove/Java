package try_catch;

import java.util.Scanner;

/**
 * �Զ��庯��nextInt������ֻ׼��������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��29�� ����10:38:22
 */
public class Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		int	count=0;
		while(true) {
			System.out.print("������һ��������");
			double num=nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
			count++;
		}

		System.out.printf("�������ƽ��ֵΪ%.2f",sum/count);

	}
	
	
	static Scanner input=new Scanner(System.in);
	static int nextInt() {
		String num=input.next();
		//"\\d*"��ʾ�������֣�string.matches()��ʾ���ַ�����ƥ��
		while(!num.matches("\\d*")) {
			System.out.print("���������֣�");
			num=input.next();
		}
		return Integer.parseInt(num);//����������
	}

}
