package try_catch_using;
/**
 * 声明异常，抛出异常，处理异常
 * 谁调用谁处理
 * 抛出异常throws
 * 手动抛出异常  throw new Excepton();
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月23日 下午2:38:01
 */
public class DefiniteException {

	public static void main(String[] args) {
		try {
			Hero 盖伦=new Hero("盖伦",60,60);
		} catch (LessThran50 e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.printStackTrace();
		}

	}
	

}
