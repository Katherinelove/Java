package try_catch_using;
/**
 * �����쳣���׳��쳣�������쳣
 * ˭����˭����
 * �׳��쳣throws
 * �ֶ��׳��쳣  throw new Excepton();
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��23�� ����2:38:01
 */
public class DefiniteException {

	public static void main(String[] args) {
		try {
			Hero ����=new Hero("����",60,60);
		} catch (LessThran50 e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}

	}
	

}
