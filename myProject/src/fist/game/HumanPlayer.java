package fist.game;
/**
 * 人类玩家类
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月16日 上午10:53:21
 */
public class HumanPlayer {
	//定义静态常量  出拳信息类型
	public static final int messageTypeFist=1;
	//定义静态常量  赢得比赛信息类型
	public static final int messageTypeWin=2;
	//定义静态常量  输掉比赛信息类型
	public static final int messageTypeLose=3;
	
	
	//属性：昵称，分数，出拳，（音效），台词（win,lose,attack,平）
	private String nickName;
	private int score;
	private int fist;
	private String[] attackMessage={
			"sb，老打我呀",
			"怎样，就是打不到我",
			"怎么，你这么菜",
			"我在前面等你",
			"过来砍我啊",
	};
	private String[] winMessage= {
			"我还你没有用力，你就倒下了",
			"等到潮水退去时，喝西北风的机会都没有了",
			"还想来战吗？lower",
			"吃着火锅，唱着歌，你就输了",			
			"站起来，和我决斗",
	};
	private String[] loseMessage= {
			"我会回来的",
			"从哪里跌倒，从哪里站起来",
			"德玛西亚人从不认输",
			"在我的字典里就没有认输两个字",
			"我要再来一战",
	};

	//方法：设置修改 昵称，分数，（播放，停止音效），说台词，出拳

	/**
	 * 根据传入的消息类型，打印对应的消息类型
	 * @param messageType 与HumanPlayer中的静态常量对应
	 */
	public void sendMessage(int messageType) {
		//随机生成0-4的数字
		int index=((int)(Math.random()*100))%5;
		//要打印的信息
		String message=null;
		switch (messageType) {
		case messageTypeFist:
			message=attackMessage[index];
			break;
		case messageTypeWin:
			message=winMessage[index];
			break;
		case messageTypeLose:
			message=loseMessage[index];
			break;
		}
		System.out.println(nickName+":"+message);
	}
	
	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		//省略验证信息
		this.nickName = nickName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score<0) {
			this.score=0;
		}
		this.score = score;
	}

	
}
