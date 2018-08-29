package circledemo;
/**
 * 升级版，封装，外界只能通过自定义方法访问设置数值
 * 私有属性+私有方法
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月15日 下午4:56:19
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
			//错误情况默认为1
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
		System.out.println("半径为："+getRadius());
		System.out.println("面积为："+getArea());
		System.out.println("周长为："+getPerimeter());
	}
	
}
