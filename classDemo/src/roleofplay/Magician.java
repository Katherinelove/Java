package roleofplay;

public class Magician extends Role{
	Magician(String name,int level,int blood){
		this.setName(name);
		this.setLevel(level);
		this.setBlood(blood);
	}
	void fight(){
		System.out.println("ħ��������");
	}
	void cure() {
		System.out.println("�������ƣ�");
	}
	public String toString() {
		return "��ʦ"+super.toString();
	}
	
}
