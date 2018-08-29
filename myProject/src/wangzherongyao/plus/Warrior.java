package wangzherongyao.plus;
/**
 * 战士类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月19日 下午3:06:03
 */
public class Warrior extends Hero{
	private int physicAttack;
	
	public Warrior() {
		super();
	}

	public Warrior(String name,long id, int x, int y) {
		super(name, id);
		setX(x);
		setY(y);
	}

	public int getPhysicAttack() {
		return physicAttack;
	}

	public void setPhysicAttack(int physicAttack) {
		this.physicAttack = physicAttack;
	}

	@Override
	public boolean canFightByDistance(Hero hero) {
		//设置战士默认攻击距离是100
		return getDistance(hero)<100;
	}

	@Override
	public void fight(Hero hero) {
		//随机生成(20-70)攻击力
		int physicAttack=(int)(Math.random()*100%51)+20;
		hero.setCurHp(hero.getCurHp()-physicAttack);
	}


	
}
