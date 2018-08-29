package circlearea;

import java.util.Scanner;

public class circleArea {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入半径：");
		Double radius=input.nextDouble();
		double circle_areas=3.14*radius*radius;
		System.out.printf("半径为%.2f的圆面积为：%.2f\n",radius,circle_areas
				);
		System.out.print("please input a string:");
		String str1=input.next();
		System.out.println(str1);
		int count=input.nextInt();
		System.out.println(count);
	}
}
