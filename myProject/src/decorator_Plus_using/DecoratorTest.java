package decorator_Plus_using;
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
//		ComponetImplA componetImplA=new ComponetImplA(component);
//		componetImplA.read();   //这里的read（）方法调用原始组件
//		ComponetImplB componetImplB=new ComponetImplB(component);
//		componetImplB.read();
		//装饰器也可以继续装饰装饰器（因为装饰器也是component对象）--加强版
		ComponetImplA componetImplA=new ComponetImplA(component);
		ComponetImplB componetImplB=new ComponetImplB(componetImplA);
		componetImplB.read();
	}

}
