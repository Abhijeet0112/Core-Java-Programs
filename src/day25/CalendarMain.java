package day25;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Current Date and Time is : "+c);
		System.out.println("Current Date and Time is : "+c.getTime());
		
		System.out.println("Time zone of current calendar object : "+c.getTimeZone());
		
		c.add(Calendar.DATE,5);
		System.out.println("After Calling add : "+c.getTime());
		
		
		System.out.println("Get Year from calendar obj : "+c.get(Calendar.YEAR));
		System.out.println("Get Month from calendar obj : "+c.get(Calendar.MONTH));
		System.out.println("Get Date from calendar obj : "+c.get(Calendar.DATE));
		System.out.println("Get Maximum days of week : "+c.getMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("Get Maximum days in Month : "+c.getMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Get Maximum Week in Year : "+c.getMaximum(Calendar.WEEK_OF_YEAR));
	}

}
