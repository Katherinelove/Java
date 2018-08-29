package decorator_using;
/**
 * 使用装饰器的场合
 * 1.当我们不在影响奇谈对象的情况下，以动态、透明的方式为对象增加功能	
 * 2.当不适合使用继承，又想对方法进行扩展
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午3:48:48
 */
public class DecoratorTest {

	public static void main(String[] args) {
		// 创建需要装饰的对象
		Component component=new TrueComponent();
		//为原始对象透明增加功能
		//创建装饰器A

		ComponetImplA componetImplA=new ComponetImplA(component);
		componetImplA.showLove();
	}

}
