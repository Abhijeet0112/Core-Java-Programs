package day26;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhnoValidation {

	public static void main(String[] args) {
//		String phno;
//		Scanner sc= new Scanner(System.in);
//		
//		
//		System.out.println("Enter your phone number (Only 10 Digits): ");
//		phno=sc.nextLine();
//		
//		Pattern phRegex = Pattern.compile("^[\\d]{10}$");
//		Matcher m = phRegex.matcher(phno);
//		
//		System.out.println(m.matches());
//		if(m.matches()) {
//			System.out.println("Your phone number added successfully");
//		}else {
//			System.out.println("Please add your phone number correctly");
//		}
		
//		String phno;
//		Scanner sc= new Scanner(System.in);
//		
//		
//		System.out.println("Enter your phone number (With country code and 10 Digits)+222 7038890112: ");
//		phno=sc.nextLine();
//		
//		Pattern phRegex = Pattern.compile("^(\\+\\d{1,3}){1}[ ]{1}[\\d]{10}$");
//		Matcher m = phRegex.matcher(phno);
//		
////		System.out.println(m.matches());
//		if(m.matches()) {
//			System.out.println("Your phone number added successfully");
//		}else {
//			System.out.println("Please add your phone number correctly");
//		}
		
		
		String phno;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter your phone number (With country code and 10 Digits)+222 70388 90112: ");
		phno=sc.nextLine();
		
		Pattern phRegex = Pattern.compile("^(\\+\\d{1,3}){1}(\\ ){1}[\\d]{5}(\\ ){1}[\\d]{5}$");
		Matcher m = phRegex.matcher(phno);
		
//		System.out.println(m.matches());
		if(m.matches()) {
			System.out.println("Your phone number added successfully");
		}else {
			System.out.println("Please add your phone number correctly");
		}
	}

}
