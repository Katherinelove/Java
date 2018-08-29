package fist.game;

import java.util.Scanner;

/**
 * 房间类
 * 
 * @author Administrator
 * @tags
 * @copyright katherinelove
 * @date 2018年8月16日 下午2:40:06
 */
public class Room {
	// 属性：房间号，房间名称，房间密码，参与游戏的玩家，计分板，道具，
	// 这里计分板，道具功能不去实现
	/** 房价Id */
	private long roomId;
	/** 房价名称d */
	private String roomName;
	/** 房价密码 */
	private String roomPassword;

	// 游戏玩家，附初始值null，后面初始游戏是再修改
	private HumanPlayer player1 = null;
	private ComputerPlayer player2 = null;
	
	// 方法：开始游戏，初始化游戏，显示菜单，选择人物，
	// 判断输赢（可写在裁判类中）,结束游戏
	
	public Room(long roomId,String roomName,String roomPassword) {
		//设置默认参数
		this.roomName="katherine";
		this.roomPassword="1123";
		//判断输入数据是否有效
		if(roomName.equals(this.roomName)&&
				roomPassword.equals(this.roomPassword)) {
			init();    //先初始化
			start();   //在开始游戏
			end();     //最后分数在end函数中
		}
		else {
			System.out.println("房间号或密码输入有误");
		}
	}
	
	/**开始游戏  是游戏的其实入口，可以写入游戏的构造器中，自动开始*/
	public void init() {
		//实例化游戏对象
		player1=new HumanPlayer();
		player2=new ComputerPlayer();
		//这里模拟一下加载条
		for (int i = 0; i < 30; i++) {
			System.out.print("#");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\n游戏加载成功！");
	}
	public void start() {
		showMenu();
		chooseRole();
		gaming();
	}

	private void gaming() {
		while(true) {
			//双发出拳
			System.out.print(player1.getNickName()+"请出拳：");
			player1.setFist(new Scanner(System.in).nextInt());
			int fist1=player1.getFist();
			
			//计算机类随机出拳
			int fist2=player2.getFist();
			
			int result=judge(fist1,fist2);
			if(result==0) {
				System.out.println("裁判：平局！");
				player1.sendMessage(HumanPlayer.messageTypeFist);
				player2.sendMessage(ComputerPlayer.messageTypeFist);
			}
			else if(result==1) {
				System.out.println("裁判：玩家-"+player1.getNickName()+"胜利！");
				player1.sendMessage(HumanPlayer.messageTypeWin);
				player2.sendMessage(ComputerPlayer.messageTypeLose);
			}
			else {
				System.out.println("裁判：电脑-"+player2.getNickName()+"胜利！");
				player1.sendMessage(HumanPlayer.messageTypeLose);
				player2.sendMessage(ComputerPlayer.messageTypeWin);
			}
			//如果在这打印结果  是每局后的当前分数，在结束时打最总分数
			
			System.out.print("是否继续游戏：");
			char answer=new Scanner(System.in).nextLine().toUpperCase().charAt(0);
			if(!('Y'==answer)) {
				break;
			}
		}
	}

	public void showMenu() {
		System.out.println("欢迎来到坡【"+roomName+"】房间");
		System.out.println("出拳规则：1-剪刀 ; 2-布 ; 3-石头");
	}
	@SuppressWarnings("resource")
	public void chooseRole() {
		System.out.println("对方角色：【1-苍老师; 2-波多野结衣; 3-泷泽萝拉; 4-舒淇】");
		System.out.println("用户角色：【1-狗头,2-鱼人,3-鳄鱼,4-猪妹】】");
		System.out.print("用户请选择:");
		int choose=new Scanner(System.in).nextInt();
		String[] nameArray= {"狗头","鱼人","鳄鱼","猪妹"};
		//省略对输入数据的验证
		player1.setNickName(nameArray[choose-1]);
		player2.setNickName("龙泽萝拉");
		System.out.println(player1.getNickName()+"VS"+"龙泽萝拉");
	}
	public int judge(int fist1,int fist2) {
		if(fist1==1&&fist2==2||fist1==2&&fist2==3||
				fist1==3&&fist2==1) {
			//不要在函数类做输出功能
//			System.out.println("裁判：玩家"+player1.getNickName()+"胜利！");
//			player1.sendMessage(HumanPlayer.messageTypeWin);
//			player2.sendMessage(ComputerPlayer.messageTypeLose);
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return 1;
		}
		if(fist1==fist2) {
			System.out.println("裁判：平局！");
//			player1.sendMessage(HumanPlayer.messageTypeFist);
//			player2.sendMessage(ComputerPlayer.messageTypeFist);
			return 0;
		}
//		System.out.println("裁判：电脑："+player2.getNickName()+"胜利！");
//		player1.sendMessage(HumanPlayer.messageTypeLose);
//		player2.sendMessage(ComputerPlayer.messageTypeWin);
		player1.setScore(player1.getScore()-1);
		player2.setScore(player2.getScore()+1);
		return -1;
	}
	public void end() {
		System.out.println("游戏结束，欢迎下次来玩！");
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
