package wangzherongyao.plus;

/**
 * 升级版王者荣耀--利用抽象类和抽象方法
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月19日 下午2:41:02
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
	
	//PK肯定需要对象
	public void PK(Hero hero) {
		if(canFightByDistance(hero)&&curHp>0&&hero.getCurHp()>0) {
			fight(hero);
		}else{
			System.out.println("由于距离太远，无法攻击！");
		}
		System.out.println("两位英雄的状态：");
		System.out.println("昵称\t血量\tx\ty");
		System.out.println(name+"\t"+curHp+"\t"
				+x+"\t"+y+"\t");
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getCurHp(),hero.getX(),hero.getY());
	}
	//判断距离  肯定需要另外一个对象
	public abstract boolean canFightByDistance(Hero hero);
	//攻击肯定需要对象
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
			this.level = 1; // 默认1级
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
