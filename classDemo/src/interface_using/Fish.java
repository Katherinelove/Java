package interface_using;
/**
 * �������������Ӿ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��27�� ����7:37:39
 */
public abstract class Fish implements Swimmer {
	//��Ϊ���࣬������Ӿ��Ϊ������Ϊ������,����û��������Ӿ�ӿڱ�����дһ�Ρ�
	protected String name;
	public Fish(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	public abstract void swim(); 
}
