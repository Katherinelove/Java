package date_using;

import java.awt.image.SampleModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *Calendar是单例模式，是根据子类 GregorianCalendar的实例实现的（多态）
 *
 * @author Administrator
 * @tags   
 * @copyright  katherinelove 
 * @date  2018年8月19日 上午9:21:39
 */
public class CalendarAndDate {
	public static void main(String[] args) throws ParseException {
		//获取的唯一实例是子类GregorianCalendar的实例   多态形式	
		//date对象只是可以作为中间实例，已经过时了
		//只能实例化一个对象，但是可以自主设置时间
		Calendar cal1=Calendar.getInstance(); 
		
		int year=cal1.get(Calendar.YEAR);
		int month=cal1.get(Calendar.MONTH);
		int dayOfMonth=cal1.get(Calendar.DAY_OF_MONTH);
		int hour=cal1.get(Calendar.HOUR_OF_DAY);
		int minute=cal1.get(Calendar.MINUTE);
		int second=cal1.get(Calendar.SECOND);
		long msecond=cal1.get(Calendar.MILLISECOND);
		
		//如何组装成固定格式
		//一是 string.format（）方法
		//%02d  2表示两位数，不足两位补0
		String strTime=String.format("%d-%02d-%02d %d:%d:%d %d",
			year,month,dayOfMonth,hour,minute,second,msecond);
		System.out.println("当前时间是："+strTime);
		
		//二是 利用Date.toLocalString()
		//为日历设定格式
		cal1.set(2012,5,12,14,28,52);
		Date date=cal1.getTime();
		System.out.println("设置时间后："+date.toLocaleString());
		
		//三是 利用SimpleDateFormat对象.format（）方法格式化解释时间
		//设置时间格式
		SimpleDateFormat format=
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		//date 作为中间对象  解析时间字符串  SimpleDateFormat对象.parse(string)
		Date newDate=format.parse("2017-8-9 14:22:32:222");
		System.out.println("解析后时间："+newDate.toLocaleString());
		
		
		//如何获取另外一个时间对象 利用GregorianCalendar的实例化
//		GregorianCalendar cal=new GregorianCalendar();
		//为了获取8月   要设置成（8-1）
		Calendar cal2=new GregorianCalendar(2012,(8-1),12);    //多态形式
		//cal2.getTimeInMillis()     
		//Calendar对象.getTimeInMillis() 获取1900以来的毫秒数
		long diff=cal2.getTimeInMillis()-cal1.getTimeInMillis();
		int diffDay=(int)(diff/1000/60/60/24);
		System.out.println("时间差："+diff+"ms");
		System.out.println("相差天数："+diffDay+"D");
		
		//如何获取当前时间各个field的取值范围
		System.out.println("cal2当前时间年份最大值"+
		cal2.getActualMaximum(Calendar.YEAR));
		System.out.println("cal2当前时间年份最大值"+
				cal2.getActualMinimum(Calendar.YEAR));
	}

}
