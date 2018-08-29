package interface_using;
/**
 * 主程序入口
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月27日 下午7:35:54
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSwim(new Shark("shark-dark"));
		doSwim(new swimingHuman("帅"));
		doSwim(new SeaAirplane("kather"));
		doSwim(new Submarine("kather"));
	}
	
	static void doSwim(Swimmer swimmer) {
//		drive.dive();
		swimmer.swim();
	}

}
