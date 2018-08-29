package interface_using;
/**
 * 潜艇  深浅均可
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午8:34:53
 */
public class Submarine extends Boat implements Drive{
	public Submarine(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println("潜水艇"+name+"-正在深潜");
	}
}
