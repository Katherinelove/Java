package function_application;

import java.util.Scanner;

/**
 * 输入整型星期   文字打印
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月11日 下午4:55:17
 */
public class weekDayDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("今天是星期几：");
		int dayofweek=input.nextInt();
		
		printWeekdayOfChinese(dayofweek);
		printWeekdayOfEnglish(dayofweek);
		
	}
	//如果多个函数中需要统一操作，提出一个方法以便以后扩展
	private static boolean isValuateWeeekDay(int dayofweek){
		if(dayofweek<1||dayofweek>7) {
			return false;
		}
		return true;
	}
	private static void printWeekdayOfEnglish(int dayofweek) {
		// 打印英文
		if(!isValuateWeeekDay(dayofweek)) {
			System.out.println("请输入合法的星期！");
		}else {
			String[] weekday={"monday","tuesday","monday","thursday","friday","saturday","sunday"};
			System.out.println(weekday[dayofweek-1]);
		}
	}

	private static void printWeekdayOfChinese(int dayofweek) {
		// 打印中文
		if(!isValuateWeeekDay(dayofweek)) {
			System.out.println("请输入合法的星期！");
		}else {
			String[] weekday={"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
			System.out.println(weekday[dayofweek-1]);	
		}

	}

}
