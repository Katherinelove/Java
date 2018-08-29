package client_chats;
/**
 * 定义一个借口，一种行为，这里为记录对clientqueue（增加、移除）的Client这种行为
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月28日 下午3:23:47
 */
public interface ClientListener {
	//新增会调用此方法
	void clientAdded(ClientEvent event);      //抽象方法，这里要传参数，使用多态
	//移除会调用此方法
	void cilentRemoved(ClientEvent event);
}
