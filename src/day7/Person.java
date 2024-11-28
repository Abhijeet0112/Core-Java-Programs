package day7;

import java.util.Scanner;

public class Person {
	//fields
	String name;
	String gender;
	int age;
	void accept() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Gender : ");
		gender=sc.nextLine();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		
	}
	void display(){
		System.out.println("~~~Persons information~~~");
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Age = "+age);
	}
}
