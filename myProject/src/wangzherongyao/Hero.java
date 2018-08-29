package wangzherongyao;

/**
 * 王者荣耀英雄类 --父类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月18日 下午5:17:44
 */
public class Hero {
	private String nickName;
	private int level;
	private int maxlife;
	private int curLife;
	
	public Hero() {
		super();
	}
	
	//多态
	public int compareToByNickName(Hero hero) {
		if(getNickName().compareTo(hero.getNickName())>0)
			return 1;
		if(getNickName().compareTo(hero.getNickName())>0)
			return 0;
		else
			return -1;
	}
	//多态
	public int compareToByLevel(Hero hero) {
		if(this.getLevel()>hero.getLevel()) {
			return 1;
		}
		else if(this.getLevel()==hero.getLevel()) {
			return 0;
		}
		else {
			return -1;
		}
	}

	public void move() {
		System.out.println("靠腿，闪现，瞬移！");
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxlife() {
		return maxlife;
	}

	public void setMaxlife(int maxlife) {
		this.maxlife = maxlife;
	}

	public int getCurLife() {
		return curLife;
	}

	public void setCurLife(int curLife) {
		this.curLife = curLife;
	}

	

}
