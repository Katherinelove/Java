package overrideusing;
/**
 * overload_using method
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月25日 下午2:56:03
 */
public class OverlodeUsing {
	{
		System.out.println("i love you!");
	}
	static float radius;
	static final float PI=3.14f;
	
	OverlodeUsing(){
		this(10);
		
	}
	OverlodeUsing(float radius){
		this.radius=radius;
	}
	
	static float area() {
		float area=OverlodeUsing.PI*radius*radius;
		return area;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverlodeUsing ol=new OverlodeUsing();
		System.out.println(ol.area());
	}

}
