package wangzherongyao;

public class Maintest {

	public static void main(String[] args) {
		Warrior 曹操=new Warrior("曹操");
		Magician 貂蝉=new Magician("貂蝉");
		//默认对象调用tostring()方法
		System.out.println("名称\t级别\t最大生命值\t攻击力");
		System.out.println(曹操);
		System.out.println(貂蝉);
		//多态使用
		System.out.println(曹操.compareToByLevel(貂蝉));
	}

}
