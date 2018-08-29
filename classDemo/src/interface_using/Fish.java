package interface_using;
/**
 * 整个鱼类均可游泳
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午7:37:39
 */
public abstract class Fish implements Swimmer {
	//作为父类，子类游泳行为待定，为抽象类,即是没操作，游泳接口必须书写一次。
	protected String name;
	public Fish(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	public abstract void swim(); 
}
