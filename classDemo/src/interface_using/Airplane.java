package interface_using;
/**
 * �ɻ���
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����8:24:26
 */
public class Airplane implements Flyer{
	String name;
	public Airplane(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ɻ�"+name+"-�ڿ��з���");
	}
}
