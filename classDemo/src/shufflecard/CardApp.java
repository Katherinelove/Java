package shufflecard;

import java.util.Scanner;

public class CardApp {
	private String userAccount;
	private float balence;
	private int bonus=0;
	public CardApp(String user_account,float balence,int bonus) {
		// TODO Auto-generated constructor stub
		this.userAccount=user_account;
		this.balence=balence;
		this.bonus=bonus;
	}
	
	public String getUserAccount() {
		return this.userAccount;
	}
	
	public float getBalence() {
		return this.balence;
	}
	public int getBonus() {
		return this.bonus;
	}
	
	public void store(float money) {
		if(money>0) {
			this.balence+=money;
			if(money>=1000) {
				this.bonus++;
			}
		}
		else{
			System.out.println("�洢ֵ��Ϊ����С�����������Ц����");
		}
	}
	
	
	public void charge(float money) {
		if(money>0) {
			this.balence-=money;
		}
		else {
			System.out.println("ȡǮΪ�������ⲻ�ǽ��ҳ�ֵ��С������ҪҪ������Ϸ�����");
		}
	}
}
