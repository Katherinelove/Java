package function_application;

import java.util.Scanner;

/**
 * ������������   ���ִ�ӡ
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��11�� ����4:55:17
 */
public class weekDayDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������ڼ���");
		int dayofweek=input.nextInt();
		
		printWeekdayOfChinese(dayofweek);
		printWeekdayOfEnglish(dayofweek);
		
	}
	//��������������Ҫͳһ���������һ�������Ա��Ժ���չ
	private static boolean isValuateWeeekDay(int dayofweek){
		if(dayofweek<1||dayofweek>7) {
			return false;
		}
		return true;
	}
	private static void printWeekdayOfEnglish(int dayofweek) {
		// ��ӡӢ��
		if(!isValuateWeeekDay(dayofweek)) {
			System.out.println("������Ϸ������ڣ�");
		}else {
			String[] weekday={"monday","tuesday","monday","thursday","friday","saturday","sunday"};
			System.out.println(weekday[dayofweek-1]);
		}
	}

	private static void printWeekdayOfChinese(int dayofweek) {
		// ��ӡ����
		if(!isValuateWeeekDay(dayofweek)) {
			System.out.println("������Ϸ������ڣ�");
		}else {
			String[] weekday={"����һ","���ڶ�","������","������","������","������","������"};
			System.out.println(weekday[dayofweek-1]);	
		}

	}

}
