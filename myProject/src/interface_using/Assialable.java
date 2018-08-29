package interface_using;
/**
 * 接口，是比抽象类更加抽象的类
 * 只能1.8之前只能为静态常量和抽象方法
 * 1.8后可在方法前  加default定义完整方法
 * 类表示多个相同特征的集合
 * 接口表示拥有某一特征（行为）的一类
 * 接口的存在，可以使不同的类具有相同的行为，更加灵活的运用多态
 * 接口-抽象父类-子类实例化
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月20日 下午3:10:24
 */
public interface Assialable {
	//这些方法用于核心业务
	String getName();
	int getLevel();
	int getCurHp();
	int getX();
	int getY();
	void setCurHp(int curHp);
	
	//核心业务
	boolean canFightBydistance(Assialable assialable);
	void fight(Assialable assialable);
}
