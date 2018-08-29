package printbrand;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * 
 * @date  2018年7月3日 下午2:37:24
 */

public class 华硕品牌打印 {
	public static void main(String[] args) {
		String brands="华硕";
		String type="GTX-1080";
		int HZ=1569;
		float length=29.8f;
		double width=13.4;
		double height=5.25;
		System.out.println("品牌： "+brands);
		System.out.println("型号 "+type);
		System.out.println("核心频率 "+HZ+"HZ");
		System.out.println("长:宽：高");
		/*
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		*/
		Scanner input1=new Scanner(System.in);
		input1.nextLine();
		System.out.println(input1);
		
	}

}
