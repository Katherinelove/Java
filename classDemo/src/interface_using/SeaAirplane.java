package interface_using;
/**
 * 两用飞机
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午8:28:29
 */
public class SeaAirplane extends Airplane implements Swimmer{
	public SeaAirplane(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("两用飞机"+name+"-正在航行");
		
	}
}
