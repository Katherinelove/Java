package wangzherongyao;

import javax.xml.transform.sax.TemplatesHandler;

/**
 * 对 对象数组按照名称进行排序
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月18日 下午6:34:25
 */
public class SortHero {

	public static void main(String[] args) {
		//创建五个战士实例
		Warrior 战士1=new Warrior();
		Warrior 战士2=new Warrior();
		Warrior 战士3=new Warrior();
		Warrior 战士4=new Warrior();
		Warrior 战士5=new Warrior();
		
		//创建五个法师实例
		Magician 法师1=new Magician();
		Magician 法师2=new Magician();
		Magician 法师3=new Magician();
		Magician 法师4=new Magician();
		Magician 法师5=new Magician();
		
		//存储对象
//		Hero[] heroArray=new Hero[10];
		Hero[] heroArray= {战士1,战士2,战士3,战士4,战士5,
						   法师1,法师2,法师3,法师4,法师5};
		System.out.println("排序前:");
		printInfo(heroArray);
		sortByName(heroArray);
		System.out.println("排序后:");
		printInfo(heroArray);
	}
	
	
	public static void printInfo(Hero[] hero) {
		System.out.println("名称\t级别\t最大生命值\t攻击力");
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
