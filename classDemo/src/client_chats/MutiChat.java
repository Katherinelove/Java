package client_chats;
/**
 * 模拟开发多人联机程序，要求对每个联机客户端，都会建立一个client对象封装相关信息
 * 重点是对匿名类的使用（只使用一次或很少使用的情况）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月28日 下午3:07:05
 */
public class MutiChat {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
				Client c1=new Client("zengshuai","127.0.0.01");
				Client c2=new Client("katherine","192.168.0.2");
				
				ClientQueue queue=new ClientQueue();
				//匿名内部类
				queue.addClientListener(new ClientListener() {
					
					
					//接口方法重新定义
					@Override
					public void clientAdded(ClientEvent event) {
						// TODO Auto-generated method stub
						System.out.printf("%s从%s联机%n",event.getName(),event.getIp());
					}
					
					@Override
					public void cilentRemoved(ClientEvent event) {
						// TODO Auto-generated method stub
						System.out.printf("%s从%s脱机%n",event.getName(),event.getIp());
					}
				});

				queue.add(c1);
				queue.add(c2);
				queue.remove(c1);
				queue.remove(c2);
	}
}
