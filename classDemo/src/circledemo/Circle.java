package circledemo;

import java.util.Scanner;

/**
 * Բ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��15�� ����4:16:12
 */
public class Circle {
	private double radius;
	void inputRadius(){
		Scanner input=new Scanner(System.in);
		System.out.print("������뾶��");
		radius=input.nextDouble();
	}
	void showMessage(){
		System.out.println("�뾶Ϊ��"+getRadius());
		System.out.println("���Ϊ��"+getArea());
		System.out.println("�ܳ�Ϊ��"+getPerimeter());
	}
	double getArea() {
		if(radius<0) {
			inputRadius();
		}
		return Math.PI*Math.pow(radius, 2);
	}
	double getPerimeter() {
		if(radius<0) {
			inputRadius();
		}
		return 2*Math.PI*radius;
	}
	double getRadius() {
		return radius;
	}
}
