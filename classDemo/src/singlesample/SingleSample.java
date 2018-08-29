package singlesample;
/**
 * static方法 加private构造器方法实现单例模式
 * 单例模式  只能实例化一次,外面无法直接实例化，只有听过调用类的静态方法
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月19日 上午8:39:29
 */
public class SingleSample {
	/** 不能实例化，只能使用静态方法，静态属性*/
	private static SingleSample me=null;  //用来存储唯一的实例对象
	
	public static int count=1;            //实例属性，每实例化，都会设置成默认值
	
	private SingleSample() {
		count++;                 //用来计数实例化个数
//		me=this;                 //没用
	}
	 
	/** 单例模式核心代码*/
	public static SingleSample getInstance() {
		if(me==null) 
			return me=new SingleSample();   //类中可以实例化
		return me;
	}
}
