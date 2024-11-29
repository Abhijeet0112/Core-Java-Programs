package day26;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String email;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your Email ID : ");
		email=sc.nextLine();
		Pattern p = Pattern.compile("^([A-Za-z0-9_]+)@([A-Za-z_.]+)$");
		Matcher m = p.matcher(email);
		
		if(m.matches()) {
			System.out.println("Email is Correct");
		}else {
			System.out.println("Email is incorrect");
		}
	}

}
