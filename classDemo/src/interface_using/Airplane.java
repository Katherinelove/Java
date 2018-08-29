package interface_using;
/**
 * 飞机类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午8:24:26
 */
public class Airplane implements Flyer{
	String name;
	public Airplane(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机"+name+"-在空中飞行");
	}
}
