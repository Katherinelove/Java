package roleofplay;

import javax.print.DocFlavor.STRING;

public class SwordsMan extends Role{
    //override
	SwordsMan(String name,int level,int blood){
		this.setName(name);
		this.setLevel(level);
		this.setBlood(blood);
	}
	void fight() {
		System.out.println("�ӽ�������");
		}
	public String toString() {
		return "��ʿ"+super.toString();
	}
}