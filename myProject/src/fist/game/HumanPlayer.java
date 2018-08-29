package fist.game;
/**
 * ���������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��16�� ����10:53:21
 */
public class HumanPlayer {
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
			"sb���ϴ���ѽ",
			"���������Ǵ򲻵���",
			"��ô������ô��",
			"����ǰ�����",
			"�������Ұ�",
	};
	private String[] winMessage= {
			"�һ���û����������͵�����",
			"�ȵ���ˮ��ȥʱ����������Ļ��ᶼû����",
			"������ս��lower",
			"���Ż�������Ÿ裬�������",			
			"վ���������Ҿ���",
	};
	private String[] loseMessage= {
			"�һ������",
			"�����������������վ����",
			"���������˴Ӳ�����",
			"���ҵ��ֵ����û������������",
			"��Ҫ����һս",
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
