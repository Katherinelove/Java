package classcars;

import java.util.Scanner;

import shufflecard.CardApp;

public class useCards {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		CardApp[] cards= {
				new CardApp("katherine", 0, 0),
				new CardApp("zengshuai", 1000.0f, 1),
				new CardApp("lover", 2000, 2)			
		};

		for(CardApp card:cards) {
			System.out.printf("Ϊ��%s��%f��%d����ֵ��",
					card.getUserAccount(),card.getBalence(),card.getBonus());
			card.store(input.nextFloat());
			System.out.printf("�û���ϸ����%s��%f��%d����\n",
					card.getUserAccount(),card.getBalence(),card.getBonus());
			
		}
		
		
		
	}

}
