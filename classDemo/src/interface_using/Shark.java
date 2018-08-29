package interface_using;
/**
 * 鲨鱼类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午7:46:36
 */
public class Shark extends Fish{
	public Shark(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		}
	public void swim() {
		System.out.println("鲨鱼"+name+"游泳");
	}
}
