package fist.game;
/**
 * ���������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��16�� ����10:53:21
 */
public class ComputerPlayer {
	//���徲̬����  ��ȭ��Ϣ����
	public static final int messageTypeFist=1;
	//���徲̬����  Ӯ�ñ�����Ϣ����
	public static final int messageTypeWin=2;
	//���徲̬����  ���������Ϣ����
	public static final int messageTypeLose=3;
	
	
	//���ԣ��ǳƣ���������ȭ������Ч����̨�ʣ�win,lose,attack,ƽ��
	private String nickName;
	private int score;
	private int fist;
	private String[] attackMessage={
			"sb���ϴ���ѽC",
			"���������Ǵ򲻵���C",
			"��ô������ô��C",
			"����ǰ�����C",
			"�������Ұ�C",
	};
	private String[] winMessage= {
			"�һ���û����������͵�����C",
			"�ȵ���ˮ��ȥʱ����������Ļ��ᶼû����C",
			"������ս��lowerC",
			"���Ż�������Ÿ裬�������C",			
			"վ���������Ҿ���C",
	};
	private String[] loseMessage= {
			"�һ������C",
			"�����������������վ����C",
			"���������˴Ӳ�����C",
			"���ҵ��ֵ����û������������C",
			"��Ҫ����һսC",
	};

	//�����������޸� �ǳƣ������������ţ�ֹͣ��Ч����˵̨�ʣ���ȭ

	/**
	 * ���ݴ������Ϣ���ͣ���ӡ��Ӧ����Ϣ����
	 * @param messageType ��HumanPlayer�еľ�̬������Ӧ
	 */
	public void sendMessage(int messageType) {
		//�������0-4������
		int index=((int)(Math.random()*100))%5;
		//Ҫ��ӡ����Ϣ
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
	/**
	 * ���������ȭ�����ȡ
	 * @return
	 */
	public int getFist() {
		//�������1-3������
		fist=((int)(Math.random()*100))%3+1;
		return fist;
	}

//	public void setFist(int fist) {
//		this.fist = fist;
//	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		//ʡ����֤��Ϣ
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
