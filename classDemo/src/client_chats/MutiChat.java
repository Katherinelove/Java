package client_chats;
/**
 * ģ�⿪��������������Ҫ���ÿ�������ͻ��ˣ����Ὠ��һ��client�����װ�����Ϣ
 * �ص��Ƕ��������ʹ�ã�ֻʹ��һ�λ����ʹ�õ������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��28�� ����3:07:05
 */
public class MutiChat {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
				Client c1=new Client("zengshuai","127.0.0.01");
				Client c2=new Client("katherine","192.168.0.2");
				
				ClientQueue queue=new ClientQueue();
				//�����ڲ���
				queue.addClientListener(new ClientListener() {
					
					
					//�ӿڷ������¶���
					@Override
					public void clientAdded(ClientEvent event) {
						// TODO Auto-generated method stub
						System.out.printf("%s��%s����%n",event.getName(),event.getIp());
					}
					
					@Override
					public void cilentRemoved(ClientEvent event) {
						// TODO Auto-generated method stub
						System.out.printf("%s��%s�ѻ�%n",event.getName(),event.getIp());
					}
				});

				queue.add(c1);
				queue.add(c2);
				queue.remove(c1);
				queue.remove(c2);
	}
}
