package client_chats;
/**
 * ������Ϣ���൱����־��
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��28�� ����3:13:28
 */
public class ClientEvent {
	private Client client;
	//�Դ������Դ洢Client����
	
	public ClientEvent(Client client) {
		// ��־��ʼ��������,��һ��client����洢����־����Client��Ա������
		this.client=client;
	}
	
	//��־�п���ʹ�õķ���
	String getName() {
		return client.name;
	}
	
	String getIp() {
		return client.ip;
	}
}
