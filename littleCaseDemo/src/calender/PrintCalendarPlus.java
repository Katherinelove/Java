package calender;

import java.util.Scanner;

/**
 * �������ӡ����
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��15�� ����10:22:15
 */
public class PrintCalendarPlus {
	//ȫ�ֱ���
	public static int year=Integer.MIN_VALUE;
	public static int month=Integer.MIN_VALUE;
	private static int[] dayOfMonth= {31,28,31,30,
	   		   31,30,31,31,
	   		   30,31,30,31};
	public static void main(String[] args) {
		printcalendar();
	}

	public static void printcalendar() {
		// ��ӡ�����ĺ��Ĵ���
		// 1.��������·ݣ�1900/1/1 ������һ��
		inputYearAndMonth();
		// 2.����������
		int sum=getTotalDays();
		//     2.1  ���������������1900������year��������
		//          //�ж��Ƿ�����
		//     2.2 ����year1�µ�����month-1��������  
		//     2.3��1900-1-1-year-month-1=�������+�·�����=1��
		// 3.��ӡ��ݡ��·�
		printYearAndMonth();	
		// 4.��ӡ���ڱ���
		PrintWeekdaysTitle();
		// 5.��ӡ����
		printContent(sum%7);
		//    5.1��ӡ\t ��������
		//    5.2���߻���
		
		
	}

	private static void printContent(int dayOfWeek) {
		// 5.1��ӡ\t ��������
		//������%7--������1-6������1-6��������Ϊ0ʱ����������
		//week��ȡֵ�ǡ�1,2,3,4,5,6,0��
		//  \t�ĸ���   sepCount=������-1
		int sepCount=0;
		if(dayOfWeek==0) {
			//ֻ��������������
			sepCount=6;
		}else {
			 sepCount=dayOfWeek-1;
		}
		//��ӡ��������  \t
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		//5.2���߻���
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
		String[] weekdays= {"����һ","���ڶ�","������",
				"������","������","������","������"		
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
		//�ж��Ƿ�������ݺ��·�
		if(year==Integer.MIN_VALUE||month==Integer.MIN_VALUE) {
			inputYearAndMonth();
		}
        //2.1  ���������������1900������year��������
		int sum=getToaltDaysOfYear();
		
		//          //�ж��Ƿ�����
		//     2.2 ����year1�µ�����month-1��������  
		sum+=getTotalDayOfMonth();
		//     2.3��1900-1-1-year-month-1=�������+�·�����=1��
		sum++;
		return sum;
	}

	private static int getTotalDayOfMonth() {
		// ����year1�µ�����month-1��������  
		//�洢ÿ���µ�����
		int sum=0;
		for (int i = 0; i < month-1; i++) {
			sum+=dayOfMonth[i];
		}
		//�жϵ�ǰ���Ƿ�Ϊ����  ����ѭ�����
		if(isLeapYear(year)&&month>=3) {
			sum++;
		}
		return sum;
	}

	private static int getToaltDaysOfYear() {
		// ���������������1900������year��������
		int sum=0;
		for (int i = 1900; i <year; i++) {
			sum+=365;
			if(isLeapYear(i)) {
				//�����һ�� ��ѭ����  һ��Ϊ��λ
				sum++;
			}
		}

		return sum;
	}

	private static boolean isLeapYear(int year) {
		// �ж��Ƿ�Ϊ����
		//�ر�ע�ⲻ��ֻ�жϵ�ǰ��ݣ����Ǵ�1900������
		return year%4==0&&year%100!=0||year%400==0;
	}

	private static void inputYearAndMonth() {
		// ��������ֻ��һ�����룬����ֲ�����scanner
		Scanner input=new Scanner(System.in);
		//������ݡ��·�����������Ҫ�õ�������ȫ�ֱ���
		System.out.print("��������ݣ�");
		year=input.nextInt();
		
		System.out.print("�������·ݣ�");
		month=input.nextInt();
		
		//�ر�scanner����
		input.close();
		// ע��
		input=null;
	}

}
