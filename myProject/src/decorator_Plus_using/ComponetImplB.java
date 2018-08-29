package decorator_Plus_using;
/**
 * 装饰器实现类  A
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午3:41:00
 */
public class ComponetImplB extends Decorator {

	public ComponetImplB(Component component) {
		super(component);
	}
	@Override
	void read() {
		// 在read前后调用了自定义方法
		//即实现了原read方法的功能扩展
		this.extendReadA();
		super.read();     //原始的read方法
		this.extendReadB();
	}
	
	//自定义扩展方法
	private void extendReadA() {
		System.out.println("ComponetImplB 实现的方法前");
	}
	private void extendReadB() {
		System.out.println("ComponetImplB 实现的方法后");
	}

}
