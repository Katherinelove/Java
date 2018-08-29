package try_catch_using;
/**
 * 自定义异常类 需要重写两个构造器
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月23日 下午2:45:05
 */
public class LessThran50 extends Exception {
	public LessThran50() {
		super();
	}
	public LessThran50(String message) {
		super(message);
	}
}
