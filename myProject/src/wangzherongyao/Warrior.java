package wangzherongyao;
/**
 * սʿ��--�̳���Ӣ����
 */
public class Warrior extends Hero{
	private static int ID=1;   //�ೣ��������ÿ����ʵ����һ������++
	private int physicAttack;
	
	public Warrior() {
		//����Ĭ�ϲ���
		setNickName("Ĭ��սʿ"+ID);
		setLevel(1);
		setMaxlife(100);
		setPhysicAttack(99);
		ID++;
	}
	
	public Warrior(String nickName) {
		//���ֻ�޸�Ĭ�����ƣ���������
		this();
		//��ִ��һ�飬�ڸ���
		this.setNickName(nickName);
		
	}
	
	
	//��д
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer(getNickName());
		str.append("\t");
		str.append(getLevel());
		str.append("\t");
		str.append(getMaxlife());
		str.append("\t");
		str.append(getPhysicAttack());
		//�ǵý�stringbufferתΪstring��
		return str.toString();
	}

	public int getPhysicAttack() {
		return physicAttack;
	}

	public void setPhysicAttack(int physicAttack) {
		this.physicAttack = physicAttack;
	}
	
}
