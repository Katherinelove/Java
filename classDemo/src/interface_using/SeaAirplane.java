package interface_using;
/**
 * ���÷ɻ�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����8:28:29
 */
public class SeaAirplane extends Airplane implements Swimmer{
	public SeaAirplane(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("���÷ɻ�"+name+"-���ں���");
		
	}
}
