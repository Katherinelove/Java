package try_catch_using;

/**
 * 英雄类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月23日 下午2:40:18
 */
public class Hero {
	private String name;
	private int health;
	private int exp;

	
	public Hero() {
		setName("默认英雄");
	}
	
	public Hero(String name,int health,int exp) throws LessThran50 {
		this();
		setName(name);
		setHealth(health);
		setExp(exp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) throws LessThran50 {
		if(health>=50)
			this.health = health;
		else
			throw new LessThran50();
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
