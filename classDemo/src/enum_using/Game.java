package enum_using;
/**
 * enum运用,不像interface中的定义的常数，必须使用switch  case中deflate
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月28日 下午6:52:45
 */
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Action不能实例化
		play(Action.SART);
		play(Action.STOP);
	}
	public static void play(Action action) {
		switch(action) {
		case STOP:
			System.out.println("STOP");
			break;
		case RIGHT:
			System.out.println("RIGHT");
			break;
		case LEFT:
			System.out.println("LEFT");
			break;
		case UP:
			System.out.println("UP");
			break;
		case DOWN:
			System.out.println("DOWN");
			break;
		case SART:
			System.out.println("SART");
			break;

		}
	}

}
