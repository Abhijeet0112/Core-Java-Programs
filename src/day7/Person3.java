package day7;

import java.util.Scanner;
//use of toString method of object class to display the values
public class Person3 {
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
	@Override
	public String toString() {
		return "~~~ Person Information ~~~ \nname=" + name + "\ngender=" + gender + "\nage=" + age ;
	}
	
}
