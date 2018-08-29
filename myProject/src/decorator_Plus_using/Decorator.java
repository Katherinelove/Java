package decorator_Plus_using;
/**
 * 装饰器 一个属性（Component component）
 * 一个构造器
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月24日 下午3:30:20
 */
public class Decorator extends Component {
	//用来存存储需要  装饰的组件--多态（父类对象）
	private Component component;
	
	public Decorator(Component component) {
		setComponent(component);
	}
	
	@Override
	void read() {
		//方法重载，可以重写也可以，也可以子类重写（加关键字abstract）
		//注意：观察谁真正的实现了read()方法；
		//将请求转发给component对象，转发后就可进行一些扩展操作了
		component.read();  //多态实现子类
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}
	

}
