package interface_using;
/**
 * Ǳͧ  ��ǳ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����8:34:53
 */
public class Submarine extends Boat implements Drive{
	public Submarine(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println("Ǳˮͧ"+name+"-������Ǳ");
	}
}
