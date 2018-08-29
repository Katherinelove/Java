package interface_using;

/**
 * 抽象英雄类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月20日 下午3:19:17
 */
public abstract class Hero implements Assialable {
	private String name;
	private int level;
	private int maxHp;
	private int curHp;
	private int x;
	private int y;

	public Hero() {
		setLevel(1);
		setMaxHp(100);
		setCurHp(100);
	}
	
	public Hero(String name,int x,int y) {
		this();
		setName(name);
		setX(x);
		setY(y);
	}
	
	public void pk(Assialable assialable) {
		if(canFightBydistance(assialable)&&curHp>0
				&&assialable.getCurHp()>0) {
			fight(assialable);
		}else {
			System.out.println("距离不够，不可攻击！");
		}
		//打印对战信息
		System.out.println("双方状态：");
		System.out.println("名称\t当前血量");
		System.out.println(getName()+"\t"+getCurHp());
		System.out.println(assialable.getName()+"\t"+assialable.getCurHp());
	}
	
	public double getDistance(Assialable assialable) {
		double distance=Math.sqrt(Math.pow(Math.abs(x-assialable.getX()), 2)+
				Math.pow(Math.abs(y-assialable.getY()), 2));
		return distance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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
