package role.test;

/**
 * 英雄类，数据封装
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月16日 上午9:33:04
 */
public class Hero {
	private long id; // id 值可能很大
	private String name; // 设置名称后不可更改
	private long level; // 级别（1-999）
	private long curExp; //当前级别的经验值
	private long exp; // 当前级别升级所需经验值

	public long getId() {
		return id;
	}

	public void setId(long id) {
		//输入的值需要验证
		if(id<=0) {
			this.id=1;   //小于0默认id 1
		}
		else {
			this.id = id;
		}
	}
	
	

	public Hero(String name) {
		setName(name);
	}

	public Hero() {}

	public String getName() {
		return name;
	}

	
	//名称定义后不能修改，可以保留接口，设置为private自己可以使用
	//或者不给自己留接口，仅在类的构造器中设置初始昵称
	private void setName(String name) {
		if(name==null) {
			this.name="Katherine";//默认名字
		}
		else {
			this.name = name;
		}
	}

	public long getLevel() {
		return level;
	}

	public void setLevel(long level) {
		if(level<1||level>999) {
			this.level =1;//默认级别
		}
		this.level = level;
	}

	public long getCurExp() {
		return curExp;
	}

	public void setCurExp(long curExp) {
		this.curExp = curExp;
	}

	public long getExp() {
		exp=(long)((Math.pow(level-1, 3)+60)/5*
				(Math.pow(level-1, 2))+60);
		return exp;
	}

	//当前级别的升级需要的经验值为固定公式
//	public void setExp(long exp) {
//		this.exp = exp;
//	}

}
