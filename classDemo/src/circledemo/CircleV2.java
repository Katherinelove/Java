package circledemo;

import java.util.Scanner;

/**
 * Բ��  ������뾶װ�빹������
 * �����������޲�  Ҳ�����в���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��15�� ����4:16:12
 */
public class CircleV2 {
	private double radius;
	
	public CircleV2() {
		// TODO Auto-generated constructor stub
		inputRadius();
	}
	public CircleV2(double radius){
		if(radius>0) {
			this.radius=radius;
		}else {
			inputRadius();
		}
	}
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
