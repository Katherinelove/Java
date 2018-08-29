package date_using;

import java.awt.image.SampleModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *Calendar�ǵ���ģʽ���Ǹ������� GregorianCalendar��ʵ��ʵ�ֵģ���̬��
 *
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018��8��19�� ����9:21:39
 */
public class CalendarAndDate {
	public static void main(String[] args) throws ParseException {
		//��ȡ��Ψһʵ��������GregorianCalendar��ʵ��   ��̬��ʽ	
		//date����ֻ�ǿ�����Ϊ�м�ʵ�����Ѿ���ʱ��
		//ֻ��ʵ����һ�����󣬵��ǿ�����������ʱ��
		Calendar cal1=Calendar.getInstance(); 
		
		int year=cal1.get(Calendar.YEAR);
		int month=cal1.get(Calendar.MONTH);
		int dayOfMonth=cal1.get(Calendar.DAY_OF_MONTH);
		int hour=cal1.get(Calendar.HOUR_OF_DAY);
		int minute=cal1.get(Calendar.MINUTE);
		int second=cal1.get(Calendar.SECOND);
		long msecond=cal1.get(Calendar.MILLISECOND);
		
		//�����װ�ɹ̶���ʽ
		//һ�� string.format��������
		//%02d  2��ʾ��λ����������λ��0
		String strTime=String.format("%d-%02d-%02d %d:%d:%d %d",
			year,month,dayOfMonth,hour,minute,second,msecond);
		System.out.println("��ǰʱ���ǣ�"+strTime);
		
		//���� ����Date.toLocalString()
		//Ϊ�����趨��ʽ
		cal1.set(2012,5,12,14,28,52);
		Date date=cal1.getTime();
		System.out.println("����ʱ���"+date.toLocaleString());
		
		//���� ����SimpleDateFormat����.format����������ʽ������ʱ��
		//����ʱ���ʽ
		SimpleDateFormat format=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		//date ��Ϊ�м����  ����ʱ���ַ���  SimpleDateFormat����.parse(string)
		Date newDate=format.parse("2017-8-9 14:22:32:222");
		System.out.println("������ʱ�䣺"+newDate.toLocaleString());
		
		
		//��λ�ȡ����һ��ʱ����� ����GregorianCalendar��ʵ����
//		GregorianCalendar cal=new GregorianCalendar();
		//Ϊ�˻�ȡ8��   Ҫ���óɣ�8-1��
		Calendar cal2=new GregorianCalendar(2012,(8-1),12);    //��̬��ʽ
		//cal2.getTimeInMillis()     
		//Calendar����.getTimeInMillis() ��ȡ1900�����ĺ�����
		long diff=cal2.getTimeInMillis()-cal1.getTimeInMillis();
		int diffDay=(int)(diff/1000/60/60/24);
		System.out.println("ʱ��"+diff+"ms");
		System.out.println("���������"+diffDay+"D");
		
		//��λ�ȡ��ǰʱ�����field��ȡֵ��Χ
		System.out.println("cal2��ǰʱ��������ֵ"+
		cal2.getActualMaximum(Calendar.YEAR));
		System.out.println("cal2��ǰʱ��������ֵ"+
				cal2.getActualMinimum(Calendar.YEAR));
	}

}
