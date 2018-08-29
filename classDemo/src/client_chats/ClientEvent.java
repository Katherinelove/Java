package client_chats;
/**
 * 管理信息（相当于日志）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月28日 下午3:13:28
 */
public class ClientEvent {
	private Client client;
	//自带属属性存储Client对象
	
	public ClientEvent(Client client) {
		// 日志初始化构造器,将一个client对象存储到日志对象Client成员变量中
		this.client=client;
	}
	
	//日志中可以使用的方法
	String getName() {
		return client.name;
	}
	
	String getIp() {
		return client.ip;
	}
}
