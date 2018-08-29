package fist.game;

import java.util.Scanner;

/**
 * ������
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018��8��16�� ����2:40:06
 */
public class Room {
	// ���ԣ�����ţ��������ƣ��������룬������Ϸ����ң��Ʒְ壬���ߣ�
	// ����Ʒְ壬���߹��ܲ�ȥʵ��
	/** ����Id */
	private long roomId;
	/** ��������d */
	private String roomName;
	/** �������� */
	private String roomPassword;

	// ��Ϸ��ң�����ʼֵnull�������ʼ��Ϸ�����޸�
	private HumanPlayer player1 = null;
	private ComputerPlayer player2 = null;
	
	// ��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ�����
	// �ж���Ӯ����д�ڲ������У�,������Ϸ
	
	public Room(long roomId,String roomName,String roomPassword) {
		//����Ĭ�ϲ���
		this.roomName="katherine";
		this.roomPassword="1123";
		//�ж����������Ƿ���Ч
		if(roomName.equals(this.roomName)&&
				roomPassword.equals(this.roomPassword)) {
			init();    //�ȳ�ʼ��
			start();   //�ڿ�ʼ��Ϸ
			end();     //��������end������
		}
		else {
			System.out.println("����Ż�������������");
		}
	}
	
	/**��ʼ��Ϸ  ����Ϸ����ʵ��ڣ�����д����Ϸ�Ĺ������У��Զ���ʼ*/
	public void init() {
		//ʵ������Ϸ����
		player1=new HumanPlayer();
		player2=new ComputerPlayer();
		//����ģ��һ�¼�����
		for (int i = 0; i < 30; i++) {
			System.out.print("#");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n��Ϸ���سɹ���");
	}
	public void start() {
		showMenu();
		chooseRole();
		gaming();
	}

	private void gaming() {
		while(true) {
			//˫����ȭ
			System.out.print(player1.getNickName()+"���ȭ��");
			player1.setFist(new Scanner(System.in).nextInt());
			int fist1=player1.getFist();
			
			//������������ȭ
			int fist2=player2.getFist();
			
			int result=judge(fist1,fist2);
			if(result==0) {
				System.out.println("���У�ƽ�֣�");
				player1.sendMessage(HumanPlayer.messageTypeFist);
				player2.sendMessage(ComputerPlayer.messageTypeFist);
			}
			else if(result==1) {
				System.out.println("���У����-"+player1.getNickName()+"ʤ����");
				player1.sendMessage(HumanPlayer.messageTypeWin);
				player2.sendMessage(ComputerPlayer.messageTypeLose);
			}
			else {
				System.out.println("���У�����-"+player2.getNickName()+"ʤ����");
				player1.sendMessage(HumanPlayer.messageTypeLose);
				player2.sendMessage(ComputerPlayer.messageTypeWin);
			}
			//��������ӡ���  ��ÿ�ֺ�ĵ�ǰ�������ڽ���ʱ�����ܷ���
			
			System.out.print("�Ƿ������Ϸ��");
			char answer=new Scanner(System.in).nextLine().toUpperCase().charAt(0);
			if(!('Y'==answer)) {
				break;
			}
		}
	}

	public void showMenu() {
		System.out.println("��ӭ�����¡�"+roomName+"������");
		System.out.println("��ȭ����1-���� ; 2-�� ; 3-ʯͷ");
	}
	@SuppressWarnings("resource")
	public void chooseRole() {
		System.out.println("�Է���ɫ����1-����ʦ; 2-����Ұ����; 3-��������; 4-��信�");
		System.out.println("�û���ɫ����1-��ͷ,2-����,3-����,4-���á���");
		System.out.print("�û���ѡ��:");
		int choose=new Scanner(System.in).nextInt();
		String[] nameArray= {"��ͷ","����","����","����"};
		//ʡ�Զ��������ݵ���֤
		player1.setNickName(nameArray[choose-1]);
		player2.setNickName("��������");
		System.out.println(player1.getNickName()+"VS"+"��������");
	}
	public int judge(int fist1,int fist2) {
		if(fist1==1&&fist2==2||fist1==2&&fist2==3||
				fist1==3&&fist2==1) {
			//��Ҫ�ں��������������
//			System.out.println("���У����"+player1.getNickName()+"ʤ����");
//			player1.sendMessage(HumanPlayer.messageTypeWin);
//			player2.sendMessage(ComputerPlayer.messageTypeLose);
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return 1;
		}
		if(fist1==fist2) {
			System.out.println("���У�ƽ�֣�");
//			player1.sendMessage(HumanPlayer.messageTypeFist);
//			player2.sendMessage(ComputerPlayer.messageTypeFist);
			return 0;
		}
//		System.out.println("���У����ԣ�"+player2.getNickName()+"ʤ����");
//		player1.sendMessage(HumanPlayer.messageTypeLose);
//		player2.sendMessage(ComputerPlayer.messageTypeWin);
		player1.setScore(player1.getScore()-1);
		player2.setScore(player2.getScore()+1);
		return -1;
	}
	public void end() {
		System.out.println("��Ϸ��������ӭ�´����棡");
		System.out.println(player1.getNickName()+":"+player1.getScore());
		System.out.println(player2.getNickName()+":"+player2.getScore());
	}
	
	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomPassword() {
		return roomPassword;
	}

	public void setRoomPassword(String roomPassword) {
		this.roomPassword = roomPassword;
	}

}
