package function_parameter;

import org.omg.CORBA.StringHolder;

/**
 * ģ����Ϸ ˢ�������������Ķ��壩
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��12�� ����3:51:07
 */
public class FunctionDemo {
	public static void main(String[] args) {
		String name="katerine";
		String channel="1123";
		String message="�������Ұ��㣡";
		int count=5;
		int interval=5;
		System.out.println((int)(Math.random()*3));
		sendmessage("shuai");
		sendmessage(name,channel,message,count,interval);

	}
	
	/**
	 * �������أ�����Ĭ��ֵ�����Խ��ٲ���������������������
	 * @param name
	 */
	public static void sendmessage(String name) {
		//�����������
		String[] content= {"������","С���Ӳ���","������������"};
		//���ö����
		sendmessage(name,"0616", 
				content[(int)(Math.random()*3)],
				10, 
				1);
	}
	
	//��������������ݣ�����ﵽ���ټ�����Ҫ����Ǯ���ܺ���һ��
	/**
	 * 
	 * @param name      ����
	 * @param channel   Ƶ��
	 * @param message   ��Ϣ
	 * @param count     ����
	 * @param interval  ���
	 */
	public static void sendmessage(String name, String channel, String message, int count, int interval) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			System.out.printf("��%s�� %s:%s\n",channel,name,message);
			try {
				Thread.sleep(interval*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
