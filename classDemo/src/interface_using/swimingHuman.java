package interface_using;
/**
 * ����Ӿ������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����8:18:10
 */
public class swimingHuman extends Human implements Swimmer{

	swimingHuman(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("����Ӿ���ˣ�"+name+"����Ӿ");
	}
	
}
