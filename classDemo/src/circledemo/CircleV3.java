package circledemo;
/**
 * �����棬��װ�����ֻ��ͨ���Զ��巽������������ֵ
 * ˽������+˽�з���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��15�� ����4:56:19
 */
public class CircleV3 {
	private double radius;
	private double area;
	private double perimeter;
	
	
	
	public CircleV3() {
		this.radius=1;
	}
	public CircleV3(double radius) {
		setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius<=0) {
			//�������Ĭ��Ϊ1
			this.radius=1;
		}else {
			this.radius = radius;
		}
	}
	public double getArea() {
		double area=Math.PI*Math.pow(radius, 2);
		return area;
	}

	public double getPerimeter() {
		double perimeter=2*Math.PI*radius;
		return perimeter;
	}
	
	public void showMessage(){
		System.out.println("�뾶Ϊ��"+getRadius());
		System.out.println("���Ϊ��"+getArea());
		System.out.println("�ܳ�Ϊ��"+getPerimeter());
	}
	
}
