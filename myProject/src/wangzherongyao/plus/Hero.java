package wangzherongyao.plus;

/**
 * ������������ҫ--���ó�����ͳ��󷽷�
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��19�� ����2:41:02
 */
public abstract class Hero {
	private String name;
	private long id;
	private int level;
	private int maxHp;
	private int curHp;
	private int x;
	private int y;

	public Hero() {
		setLevel(1);
		setCurHp(100);
	}
	
	public Hero(String name,long id) {
		this();
		setName(name);
		setId(id);
	}
	
	//PK�϶���Ҫ����
	public void PK(Hero hero) {
		if(canFightByDistance(hero)&&curHp>0&&hero.getCurHp()>0) {
			fight(hero);
		}else{
			System.out.println("���ھ���̫Զ���޷�������");
		}
		System.out.println("��λӢ�۵�״̬��");
		System.out.println("�ǳ�\tѪ��\tx\ty");
		System.out.println(name+"\t"+curHp+"\t"
				+x+"\t"+y+"\t");
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getCurHp(),hero.getX(),hero.getY());
	}
	//�жϾ���  �϶���Ҫ����һ������
	public abstract boolean canFightByDistance(Hero hero);
	//�����϶���Ҫ����
	public abstract void fight(Hero hero);
	
	protected double getDistance(Hero hero) {
		double distance=Math.sqrt(Math.pow(Math.abs(getX()-hero.getX()), 2)
				+Math.pow(Math.abs(getY()-hero.getY()), 2));
		return distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if (level < 0 || level > 100) {
			this.level = 1; // Ĭ��1��
		} else {
			this.level = level;
		}
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getCurHp() {
		return curHp;
	}

	public void setCurHp(int curHp) {
		this.curHp = curHp;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
