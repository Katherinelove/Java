package singlesample;
/**
 * 单例使用
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月19日 上午8:49:55
 */
public class MainTest {

	public static void main(String[] args) {
		SingleSample lover1=SingleSample.getInstance();
		System.out.println(lover1.count);
		
		SingleSample lover2=SingleSample.getInstance();
		System.out.println(lover1.count);
		
		SingleSample lover3=SingleSample.getInstance();
		System.out.println(lover1.count);
		System.out.println(lover1==lover2);
	}


}
