package enum_using;
/**
 * enum����,����interface�еĶ���ĳ���������ʹ��switch  case��deflate
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��28�� ����6:52:45
 */
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Action����ʵ����
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
