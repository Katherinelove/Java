package collerction_case;

/**
 * javabean ����洢����
 * 
 * @author 15281
 *
 */
public class Role {//implements Comparable<Role>{
	//ʵ����Ľӿ�����Ϊ���ݴ�
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
//		//�ȽϽӿ�
//		if(hp>role.hp) return 1;
//		if(hp<role.hp) return -1;
//		return 0;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Role)) return false;
		//ǿת
		Role role=(Role) obj;
		//������ͬ
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
