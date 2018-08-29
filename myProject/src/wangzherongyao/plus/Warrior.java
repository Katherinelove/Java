package wangzherongyao.plus;
/**
 * սʿ��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��19�� ����3:06:03
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
		//����սʿĬ�Ϲ���������100
		return getDistance(hero)<100;
	}

	@Override
	public void fight(Hero hero) {
		//�������(20-70)������
		int physicAttack=(int)(Math.random()*100%51)+20;
		hero.setCurHp(hero.getCurHp()-physicAttack);
	}


	
}
