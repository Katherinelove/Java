package function_application;
/**
 * ��ֵ����   pass by value
 * ���Ƹ��������ݸ���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��11�� ����5:19:37
 */
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		//��ֵΪ������ԭֵ����
		swap(num1,num2);
		System.out.printf("num1:%d  num2:%d",num1,num2);
	}

	private static void swap(int num1, int num2) {
		// TODO Auto-generated method stub
		int temp=num1;
		num1=num2;
		num2=temp;
	}

}
