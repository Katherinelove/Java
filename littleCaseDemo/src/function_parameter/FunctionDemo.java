package function_parameter;

import org.omg.CORBA.StringHolder;

/**
 * 模拟游戏 刷屏（方法参数的定义）
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月12日 下午3:51:07
 */
public class FunctionDemo {
	public static void main(String[] args) {
		String name="katerine";
		String channel="1123";
		String message="巧兰，我爱你！";
		int count=5;
		int interval=5;
		System.out.println((int)(Math.random()*3));
		sendmessage("shuai");
		sendmessage(name,channel,message,count,interval);

	}
	
	/**
	 * 方法重载，设置默认值，可以较少参数调用最多参数方法设置
	 * @param name
	 */
	public static void sendmessage(String name) {
		//随机喊话内容
		String[] content= {"吃了吗？","小伙子不错","来啊，单挑啊"};
		//调用多参数
		sendmessage(name,"0616", 
				content[(int)(Math.random()*3)],
				10, 
				1);
	}
	
	//可以添加其他内容，级别达到多少级或需要多少钱才能喊话一次
	/**
	 * 
	 * @param name      姓名
	 * @param channel   频道
	 * @param message   信息
	 * @param count     次数
	 * @param interval  间隔
	 */
	public static void sendmessage(String name, String channel, String message, int count, int interval) {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			System.out.printf("【%s】 %s:%s\n",channel,name,message);
			try {
				Thread.sleep(interval*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
