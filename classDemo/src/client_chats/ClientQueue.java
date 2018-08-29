package client_chats;
/**
 * Clientqueue收集联机用户
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月28日 下午3:34:03
 */

import java.util.ArrayList;

public class ClientQueue {
	private ArrayList clients=new ArrayList(); 
	//一个（成员变量）对象就可以收集各种对象--收集联机client
	private ArrayList listeners=new ArrayList();
	//收集对clientqueue日志对象（接口）
	
	//注册clientqueue的Client
	void addClientListener(ClientListener listener) {
		//调用接口多态性
		listeners.add(listener);
	}

	public void add(Client client) {
		clients.add(client);//新增Client
		ClientEvent event=new ClientEvent(client);
		//实例化接口    通知信息包装
		for(int i=0;i<listeners.size();i++) {
			//逐一取出ClientListener通知
			ClientListener listener=(ClientListener) listeners.get(i);
			//接口多态，将Listeners中的对象取出，他们都拥有这个接口的行为
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
