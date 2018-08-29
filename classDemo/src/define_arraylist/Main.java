package define_arraylist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList names=new ArrayList();
//		collectName(names);
//		System.out.println(names);
//		
//		toUpperCase(names);

		
		ArrayList al1=new ArrayList();
		collectName(al1);
		ArrayList al2=al1;
		System.out.println(al1.equals(al2));
//			String ob="love";
//			arraylist.add(ob);
//			Integer ig=125;
//			arraylist.add(ig);
//			System.out.println(arraylist.get(0));
//			System.out.println(arraylist.getSize());
			
			
			
	}
	//collectnames
	static void collectName(ArrayList names) {
		Scanner input=new Scanner(System.in);
		while(true) {
			System.out.println("«Î ‰»Î√˚≥∆£∫");
			String name=input.nextLine();
			if("quit".equals(name)) {
				break;
			}
			names.add(name);
		}
	}
	//toUpperCase
	static void toUpperCase(ArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			String name=(String) names.get(i);
			System.out.println(name.toUpperCase());
		}
	}

}
