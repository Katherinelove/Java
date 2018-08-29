package client_chats;
/**
 * Clientqueue�ռ������û�
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��28�� ����3:34:03
 */

import java.util.ArrayList;

public class ClientQueue {
	private ArrayList clients=new ArrayList(); 
	//һ������Ա����������Ϳ����ռ����ֶ���--�ռ�����client
	private ArrayList listeners=new ArrayList();
	//�ռ���clientqueue��־���󣨽ӿڣ�
	
	//ע��clientqueue��Client
	void addClientListener(ClientListener listener) {
		//���ýӿڶ�̬��
		listeners.add(listener);
	}

	public void add(Client client) {
		clients.add(client);//����Client
		ClientEvent event=new ClientEvent(client);
		//ʵ�����ӿ�    ֪ͨ��Ϣ��װ
		for(int i=0;i<listeners.size();i++) {
			//��һȡ��ClientListener֪ͨ
			ClientListener listener=(ClientListener) listeners.get(i);
			//�ӿڶ�̬����Listeners�еĶ���ȡ�������Ƕ�ӵ������ӿڵ���Ϊ
			listener.clientAdded(event);
			}
	}
	public void remove(Client client) {
		clients.remove(client);
		ClientEvent event=new ClientEvent(client);
		for(int i=0;i<listeners.size();i++) {
			ClientListener listener=(ClientListener) listeners.get(i);
			listener.cilentRemoved(event);
	}
	}
}
