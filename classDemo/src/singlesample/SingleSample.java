package singlesample;
/**
 * static���� ��private����������ʵ�ֵ���ģʽ
 * ����ģʽ  ֻ��ʵ����һ��,�����޷�ֱ��ʵ������ֻ������������ľ�̬����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��19�� ����8:39:29
 */
public class SingleSample {
	/** ����ʵ������ֻ��ʹ�þ�̬��������̬����*/
	private static SingleSample me=null;  //�����洢Ψһ��ʵ������
	
	public static int count=1;            //ʵ�����ԣ�ÿʵ�������������ó�Ĭ��ֵ
	
	private SingleSample() {
		count++;                 //��������ʵ��������
//		me=this;                 //û��
	}
	 
	/** ����ģʽ���Ĵ���*/
	public static SingleSample getInstance() {
		if(me==null) 
			return me=new SingleSample();   //���п���ʵ����
		return me;
	}
}
