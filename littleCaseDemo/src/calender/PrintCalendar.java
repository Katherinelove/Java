package calender;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * toprintcalendar
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年7月16日 上午10:13:25
 */
public class PrintCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		long start=System.currentTimeMillis();
		int year=0,month=0,dayOfMonth=0,i=0;
		System.out.print("请输入年份：");
		year=input.nextInt();
		System.out.print("请输入月份：");
		month=input.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayOfMonth=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayOfMonth=30;
			break;
		case 2:
			dayOfMonth=28;
			break;
		default:
			System.err.println("输入有误！");
			break;
		}
		if(year%4==0&&year%100!=0||year%400==0) {
			dayOfMonth++;
		}	
		System.out.println(year+"年"+month+"月一共有"+dayOfMonth+"d！");
		//假设2000年2月1号为星期二
		System.out.println(year+"年"+month+"月:日历面板");
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天\t");
		System.out.print("\t");
		for(i=1;i<=dayOfMonth;i++) {
			System.out.print(i);
			if((i+1)%7==0) {
				System.out.println();
			}
			else
				System.out.print("\t");
		}
		long end=System.currentTimeMillis();
		System.out.println("\n计算时间="+(end-start));
	}

}
