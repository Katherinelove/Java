package print_inventory;

public class inventory_print {
	public static void main(String[] args) {
		System.out.println("Ä³³Ô»õÇåµ¥£¡£¡");
		System.out.println("--------------------");
		System.out.println("goods\t price\t amounts\t remark ");
		String goods1="coffee";
		double price1=3.2;
		int amounts1=20;
		String remark1="for ever love!";
		System.out.printf("%s\t%.2f\t%d\t%s\n",goods1,price1,amounts1,remark1);
		String str=String.format("%-10d%10d",20,25);
		System.out.println(str);
	}

}
