package calender;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * toprintcalendar
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��7��16�� ����10:13:25
 */
public class PrintCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		long start=System.currentTimeMillis();
		int year=0,month=0,dayOfMonth=0,i=0;
		System.out.print("��������ݣ�");
		year=input.nextInt();
		System.out.print("�������·ݣ�");
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
			System.err.println("��������");
			break;
		}
		if(year%4==0&&year%100!=0||year%400==0) {
			dayOfMonth++;
		}	
		System.out.println(year+"��"+month+"��һ����"+dayOfMonth+"d��");
		//����2000��2��1��Ϊ���ڶ�
		System.out.println(year+"��"+month+"��:�������");
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������\t");
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
		System.out.println("\n����ʱ��="+(end-start));
	}

}
