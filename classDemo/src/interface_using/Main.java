package interface_using;
/**
 * ���������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����7:35:54
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSwim(new Shark("shark-dark"));
		doSwim(new swimingHuman("˧"));
		doSwim(new SeaAirplane("kather"));
		doSwim(new Submarine("kather"));
	}
	
	static void doSwim(Swimmer swimmer) {
//		drive.dive();
		swimmer.swim();
	}

}
