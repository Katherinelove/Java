package circledemo;
/**
 * 测试circle类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月15日 下午4:27:31
 */
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
		circle1.inputRadius();
		circle1.showMessage();
		
		CircleV2 circle2=new CircleV2(2);
		circle2.showMessage();
		
		CircleV3 circle3=new CircleV3(2);
		circle3.showMessage();
	}

}
