package roleofplay;
/**
 * 主程序入口
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月26日 下午2:53:16
 */
public class PRG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role role=new Role();
		SwordsMan swordsman=new SwordsMan("shuai",18,1000);
		Magician magician=new Magician("Katherine", 11, 999);
		drawFight(swordsman);
		drawFight(magician);
		
		System.out.println(swordsman.toString());
		System.out.println(magician.toString());
		
//		demoswordMan();
//		demoMagician();	
	}
	static void drawFight(Role role) {
		System.out.println(role.getName());
		role.fight();
	}

	static void demoswordMan() {
		// TODO Auto-generated method stub
		SwordsMan swordsman=new SwordsMan("shuai",18,1000);
		System.out.printf("剑士：（%s，%d，%d）%n",swordsman.getName(),
				swordsman.getLevel(),swordsman.getBlood());
	} 
	static void demoMagician() {
		Magician magician=new Magician("Katherine", 11, 999);
		System.out.printf("法师：（%s，%d，%d）%n",magician.getName(),
				magician.getLevel(),magician.getBlood());
	}

}
