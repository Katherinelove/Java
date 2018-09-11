package collerction_case;

/**
 * javabean 对象存储数据
 * 
 * @author 15281
 *
 */
public class Role {//implements Comparable<Role>{
	//实体类的接口名称为形容词
	private String name;
	private String nickName;
	private int hp;
	private int attack;

	public Role(String name, String nickName, int hp, int attack) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.hp = hp;
		this.attack = attack;
	}
	
//	@Override
//	public int compareTo(Role role) {
//		//比较接口
//		if(hp>role.hp) return 1;
//		if(hp<role.hp) return -1;
//		return 0;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Role)) return false;
		//强转
		Role role=(Role) obj;
		//名字相同
		return name.equals(role.getName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

}
