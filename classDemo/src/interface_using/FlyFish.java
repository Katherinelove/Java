package interface_using;
/**
 * ��ɵ��㣬�̳и����swim���ټӽӿ�Fly
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����7:55:44
 */
public class FlyFish extends Fish implements Flyer{
	public FlyFish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("����"+name+"��Ӿ");
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("����"+name+"����");
	}

}
