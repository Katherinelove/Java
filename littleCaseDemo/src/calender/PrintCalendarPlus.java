package calender;

import java.util.Scanner;

/**
 * 升级版打印日历
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月15日 上午10:22:15
 */
public class PrintCalendarPlus {
	//全局变量
	public static int year=Integer.MIN_VALUE;
	public static int month=Integer.MIN_VALUE;
	private static int[] dayOfMonth= {31,28,31,30,
	   		   31,30,31,31,
	   		   30,31,30,31};
	public static void main(String[] args) {
		printcalendar();
	}

	public static void printcalendar() {
		// 打印日历的核心代码
		// 1.输入年份月份（1900/1/1 是星期一）
		inputYearAndMonth();
		// 2.计算总天数
		int sum=getTotalDays();
		//     2.1  计算年份总天数（1900到输入year总天数）
		//          //判断是否闰年
		//     2.2 计算year1月到输入month-1的总天数  
		//     2.3（1900-1-1-year-month-1=年份天数+月份天数=1）
		// 3.打印年份、月份
		printYearAndMonth();	
		// 4.打印星期标题
		PrintWeekdaysTitle();
		// 5.打印日历
		printContent(sum%7);
		//    5.1打印\t 的数个数
		//    5.2逢七换行
		
		
	}

	private static void printContent(int dayOfWeek) {
		// 5.1打印\t 的数个数
		//总天数%7--余数是1-6是星期1-6但是余数为0时，是星期天
		//week的取值是【1,2,3,4,5,6,0】
		//  \t的个数   sepCount=星期数-1
		int sepCount=0;
		if(dayOfWeek==0) {
			//只有星期天是特例
			sepCount=6;
		}else {
			 sepCount=dayOfWeek-1;
		}
		//打印月中日期  \t
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		//5.2逢七换行
		int days=dayOfMonth[month-1];
		if(isLeapYear(year)&&month==2) {
			days++;
		}
		for (int i = 1; i <=days; i++) {
			System.out.print(i);
			if((i+sepCount)%7==0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
		
	}

	private static void PrintWeekdaysTitle() {
		// TODO Auto-generated method stub
		String[] weekdays= {"星期一","星期二","星期三",
				"星期四","星期五","星期六","星期天"		
		};
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i]+"\t");
		}
		System.out.println();
	}

	private static void printYearAndMonth() {
		// TODO Auto-generated method stub
		System.out.println("\t\t"+year+"\t"+month);
	}

	private static int getTotalDays() {
		//判断是否输入年份和月份
		if(year==Integer.MIN_VALUE||month==Integer.MIN_VALUE) {
			inputYearAndMonth();
		}
        //2.1  计算年份总天数（1900到输入year总天数）
		int sum=getToaltDaysOfYear();
		
		//          //判断是否闰年
		//     2.2 计算year1月到输入month-1的总天数  
		sum+=getTotalDayOfMonth();
		//     2.3（1900-1-1-year-month-1=年份天数+月份天数=1）
		sum++;
		return sum;
	}

	private static int getTotalDayOfMonth() {
		// 计算year1月到输入month-1的总天数  
		//存储每个月的天数
		int sum=0;
		for (int i = 0; i < month-1; i++) {
			sum+=dayOfMonth[i];
		}
		//判断当前年是否为闰年  在月循环外加
		if(isLeapYear(year)&&month>=3) {
			sum++;
		}
		return sum;
	}

	private static int getToaltDaysOfYear() {
		// 计算年份总天数（1900到输入year总天数）
		int sum=0;
		for (int i = 1900; i <year; i++) {
			sum+=365;
			if(isLeapYear(i)) {
				//闰年加一天 在循环内  一年为单位
				sum++;
			}
		}

		return sum;
	}

	private static boolean isLeapYear(int year) {
		// 判断是否为闰年
		//特别注意不是只判断当前年份，而是从1900年至今
		return year%4==0&&year%100!=0||year%400==0;
	}

	private static void inputYearAndMonth() {
		// 整个程序只有一次输入，定义局部变量scanner
		Scanner input=new Scanner(System.in);
		//由于年份、月份其他函数需要用到，定义全局变量
		System.out.print("请输入年份：");
		year=input.nextInt();
		
		System.out.print("请输入月份：");
		month=input.nextInt();
		
		//关闭scanner对象
		input.close();
		// 注销
		input=null;
	}

}
