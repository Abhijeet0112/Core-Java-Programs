package day1;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int age=30;
		System.out.println("Your Age is : "+age);
		//Take input from user
		int num; //variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
		num= sc.nextInt();
		System.out.println("Number is = "+num);
		String name;
		System.out.println("Enter your name");
		//Dummy nextLine
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Name is = "+name);
		sc.close();
	}

}
