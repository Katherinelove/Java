package function_application;
/**
 * 按值传递   pass by value
 * 复制副本，传递副本
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月11日 下午5:19:37
 */
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		//传值为副本，原值不变
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
