package circledemo;

import java.util.Scanner;

/**
 * 圆类  将输入半径装入构造器中
 * 构造器可以无参  也可以有参数
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月15日 下午4:16:12
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
		System.out.print("请输入半径：");
		radius=input.nextDouble();
	}
	void showMessage(){
		System.out.println("半径为："+getRadius());
		System.out.println("面积为："+getArea());
		System.out.println("周长为："+getPerimeter());
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
