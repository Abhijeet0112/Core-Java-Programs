package day8.Inheritance;

import java.util.Scanner;

public class Person {
	String name;
	String gender;
	int age;
	//Default Constructor
			Person(){
				System.out.println("Default Constructor of Person invoked");
				name="abhijeet";
				gender="male";
				age=30;
			}
		//Parameterized Constructor
			Person(String name, String gander, int age){
				System.out.println("Parameterized Constructor of Person invoked");
				this.name=name;
				this.gender=gander;
				this.age=age;
			}
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
			@Override
			public String toString() {
				return "~~~ Person Information ~~~ \nname=" + name + "\ngender=" + gender + "\nage=" + age ;
			}

}
