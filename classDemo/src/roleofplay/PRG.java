package roleofplay;
/**
 * ���������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��26�� ����2:53:16
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
		System.out.printf("��ʿ����%s��%d��%d��%n",swordsman.getName(),
				swordsman.getLevel(),swordsman.getBlood());
	} 
	static void demoMagician() {
		Magician magician=new Magician("Katherine", 11, 999);
		System.out.printf("��ʦ����%s��%d��%d��%n",magician.getName(),
				magician.getLevel(),magician.getBlood());
	}

}
