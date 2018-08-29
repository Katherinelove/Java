package wangzherongyao;
/**
 * 战士类--继承自英雄类
 */
public class Warrior extends Hero{
	private static int ID=1;   //类常量，用于每次是实例化一个对象++
	private int physicAttack;
	
	public Warrior() {
		//设置默认参数
		setNickName("默认战士"+ID);
		setLevel(1);
		setMaxlife(100);
		setPhysicAttack(99);
		ID++;
	}
	
	public Warrior(String nickName) {
		//如何只修改默认名称，其他不变
		this();
		//先执行一遍，在复制
		this.setNickName(nickName);
		
	}
	
	
	//重写
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer(getNickName());
		str.append("\t");
		str.append(getLevel());
		str.append("\t");
		str.append(getMaxlife());
		str.append("\t");
		str.append(getPhysicAttack());
		//记得将stringbuffer转为string型
		return str.toString();
	}

	public int getPhysicAttack() {
		return physicAttack;
	}

	public void setPhysicAttack(int physicAttack) {
		this.physicAttack = physicAttack;
	}
	
}
