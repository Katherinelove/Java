package calender;

import java.util.Calendar;
import java.util.Date;

/**
 * ����demo
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��8�� ����10:01:10
 */
public class date_calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        getCalendar();
        getDae();
        
	}

	private static void getDae() {
		// TODO Auto-generated method stub
		Date today=new Date();
		int year=today.getYear();     //��ʱ
		int month=today.getMonth();
		int day=today.getDate();
	}

	private static void getCalendar() {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		System.out.printf("������%d��%d��%d�գ�",year,month,day);
	}

}
