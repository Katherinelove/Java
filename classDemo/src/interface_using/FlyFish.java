package interface_using;
/**
 * 会飞的鱼，继承父类的swim，再加接口Fly
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午7:55:44
 */
public class FlyFish extends Fish implements Flyer{
	public FlyFish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("飞鱼"+name+"游泳");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞鱼"+name+"飞行");
	}

}
