package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
	
		System.out.println(time);
		
		SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str =s.format(time);
		System.out.println(str);
	
		System.out.println("===============");
		Date d = new Date();
	System.out.println(d);
	System.out.println("format(d) : " + s.format(d));
	
	Calendar cal = Calendar.getInstance();
	System.out.println("car :" + cal);
	System.out.println(cal.get(Calendar.YEAR));
	System.out.println(cal.get(Calendar.MONTH)+1);
	System.out.println(cal.get(Calendar.DATE));
	System.out.println(cal.get(Calendar.HOUR));
	System.out.println(cal.get(Calendar.MINUTE));
	System.out.println(cal.get(Calendar.SECOND));
	
	
	
	
	
	
	
	
	
	}
}
