package wangzherongyao;

import javax.xml.transform.sax.TemplatesHandler;

/**
 * �� �������鰴�����ƽ�������
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��18�� ����6:34:25
 */
public class SortHero {

	public static void main(String[] args) {
		//�������սʿʵ��
		Warrior սʿ1=new Warrior();
		Warrior սʿ2=new Warrior();
		Warrior սʿ3=new Warrior();
		Warrior սʿ4=new Warrior();
		Warrior սʿ5=new Warrior();
		
		//���������ʦʵ��
		Magician ��ʦ1=new Magician();
		Magician ��ʦ2=new Magician();
		Magician ��ʦ3=new Magician();
		Magician ��ʦ4=new Magician();
		Magician ��ʦ5=new Magician();
		
		//�洢����
//		Hero[] heroArray=new Hero[10];
		Hero[] heroArray= {սʿ1,սʿ2,սʿ3,սʿ4,սʿ5,
						   ��ʦ1,��ʦ2,��ʦ3,��ʦ4,��ʦ5};
		System.out.println("����ǰ:");
		printInfo(heroArray);
		sortByName(heroArray);
		System.out.println("�����:");
		printInfo(heroArray);
	}
	
	
	public static void printInfo(Hero[] hero) {
		System.out.println("����\t����\t�������ֵ\t������");
		for (int i = 0; i < hero.length; i++) {
			System.out.println(hero[i]);
		}
	}
	
	public static Hero[] sortByName(Hero[] hero){
		for (int i = 0; i < hero.length; i++) {
			for (int j = 0; j <hero.length-i-1; j++) {
				Hero tempHero=null;
				if(hero[j].compareToByNickName(hero[j+1])<0) {
					tempHero=hero[j];
					hero[j]=hero[j+1];
					hero[j+1]=tempHero;
				}
			}	
		}
		return hero;
	}

}
