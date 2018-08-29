package interface_using;

/**
 * 建筑类 没有pk方法即不能攻击别人 但是可以被攻击 掉血
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月20日 下午4:05:54
 */
public class Structure implements Assialable {
	private String name;
	private int level;
	private int maxHp;
	private int curHp;
	private int x;
	private int y;

	public Structure() {
		setLevel(1);
		setMaxHp(100);
		setCurHp(100);
	}

	public Structure(String name,int x,int y) {
		this();
		setName(name);
		setX(x);
		setY(y);
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
	
	@Override
	public boolean canFightBydistance(Assialable assialable) {
		//建筑物的攻击距离
		return getDistance(assialable)<200;
	}

	@Override
	public void fight(Assialable assialable) {
		int tempAttack=(int)(Math.random()*100%51)+30;
		assialable.setCurHp(assialable.getCurHp()-tempAttack);
		System.out.println(getName()+"攻击"+
		assialable.getName()+"成功！");
		
	}

}
