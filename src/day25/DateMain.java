package day25;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Current date of the System : "+date);
		
		long time = System.currentTimeMillis();
		System.out.println("Current Time in millisecons : "+time);
		
		Date date2 = new Date(time);
		System.out.println("Date vObject with time constructor : "+date2);

	}

}
