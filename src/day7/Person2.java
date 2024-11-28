package day7;

import java.util.Scanner;

public class Person2 {
	//fields
	String name;
	String gender;
	int age;
	void accept() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Age : ");
		age=sc.nextInt();
		System.out.println("Enter Gender : ");
		sc.nextLine();
		gender=sc.nextLine();
		sc.close();
	}
	void display(){
		System.out.println("~~~Persons information~~~");
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Age = "+age);
	}
}
