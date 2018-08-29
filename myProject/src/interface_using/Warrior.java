package interface_using;

/**
 * 英雄类 的子类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月20日 下午3:25:54
 */
public class Warrior extends Hero {
	private final int AttackDistance=100;
	private int physicAttack;

	public Warrior() {
		super();
	}

	public Warrior(String name, int x, int y) {
		super(name, x, y);
	}

	public int getPhysicAttack() {
		return physicAttack;
	}

	public void setPhysicAttack(int physicAttack) {
		this.physicAttack = physicAttack;
	}

	@Override
	public boolean canFightBydistance(Assialable assialable) {
		//战士默认攻击距离
		return getDistance(assialable)<AttackDistance;
	}

	@Override
	public void fight(Assialable assialable) {
		int tempAttack=(int)(Math.random()*100%51)+20;
		assialable.setCurHp(assialable.getCurHp()-tempAttack);
		System.out.println(getName()+"攻击"+
		assialable.getName()+"成功！");
	}
}
