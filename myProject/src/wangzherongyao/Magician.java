package wangzherongyao;
/**
 * ��ʦ��--�̳���Ӣ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��18�� ����5:26:11
 */
public class Magician extends Hero{
	private static int ID=1;
	private int magicAttack;
	
	
	
	public Magician() {
		//����Ĭ�ϲ���
		setNickName("Ĭ�Ϸ�ʦ"+ID);
		setLevel(1);
		setMaxlife(100);
		setMagicAttack(99);
		ID++;
	}
	
	public Magician(String nickName) {
		//���ֻ�޸�Ĭ�����ƣ���������
		this();
		//��ִ��һ�飬�ڸ���
		this.setNickName(nickName);				
	}
	
	//��д��
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer(getNickName());
		str.append("\t");
		str.append(getLevel());
		str.append("\t");
		str.append(getMaxlife());
		str.append("\t");
		str.append(getMagicAttack());
		//�ǵý�stringbufferתΪstring��
		return str.toString();
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
