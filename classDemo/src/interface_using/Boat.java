package interface_using;
/**
 * ֻ��ǳ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����8:36:17
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
		System.out.println("��ֻ"+name+"-���ں���");
	}
}
