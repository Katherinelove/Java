package interface_using;
/**
 * 会游泳的人类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午8:18:10
 */
public class swimingHuman extends Human implements Swimmer{

	swimingHuman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("会游泳的人："+name+"在游泳");
	}
	
}
