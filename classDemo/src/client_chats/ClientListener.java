package client_chats;
/**
 * ����һ����ڣ�һ����Ϊ������Ϊ��¼��clientqueue�����ӡ��Ƴ�����Client������Ϊ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��28�� ����3:23:47
 */
public interface ClientListener {
	//��������ô˷���
	void clientAdded(ClientEvent event);      //���󷽷�������Ҫ��������ʹ�ö�̬
	//�Ƴ�����ô˷���
	void cilentRemoved(ClientEvent event);
}
