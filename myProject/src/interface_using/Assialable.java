package interface_using;
/**
 * �ӿڣ��Ǳȳ�������ӳ������
 * ֻ��1.8֮ǰֻ��Ϊ��̬�����ͳ��󷽷�
 * 1.8����ڷ���ǰ  ��default������������
 * ���ʾ�����ͬ�����ļ���
 * �ӿڱ�ʾӵ��ĳһ��������Ϊ����һ��
 * �ӿڵĴ��ڣ�����ʹ��ͬ���������ͬ����Ϊ�������������ö�̬
 * �ӿ�-������-����ʵ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��20�� ����3:10:24
 */
public interface Assialable {
	//��Щ�������ں���ҵ��
	String getName();
	int getLevel();
	int getCurHp();
	int getX();
	int getY();
	void setCurHp(int curHp);
	
	//����ҵ��
	boolean canFightBydistance(Assialable assialable);
	void fight(Assialable assialable);
}
