package interface_using;
/**
 * 只能浅行
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午8:36:17
 */
public class Boat implements Swimmer{
	String name;
	public Boat(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("船只"+name+"-正在航行");
	}
}
