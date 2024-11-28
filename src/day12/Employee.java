package day12;

import java.util.Scanner;
public class Employee  implements Person{
	double salary;
	String name = null;
	int age;
	
	

	public Employee() {
		
	}

	public Employee(double salary, String name, int age) {
		super();
		this.salary = salary;
		this.name = name;
		this.age = age;
	}

	@Override
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Name, Age, Salary");
		name= sc.nextLine();
		age= sc.nextInt();
		salary= sc.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("~~~Employee Information~~~");
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Salary : "+salary);
		
	}

}
