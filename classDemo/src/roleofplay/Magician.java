package roleofplay;

public class Magician extends Role{
	Magician(String name,int level,int blood){
		this.setName(name);
		this.setLevel(level);
		this.setBlood(blood);
	}
	void fight(){
		System.out.println("魔法攻击！");
	}
	void cure() {
		System.out.println("法术治疗！");
	}
	public String toString() {
		return "法师"+super.toString();
	}
	
}
