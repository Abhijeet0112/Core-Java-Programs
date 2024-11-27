package day8.Inheritance;

import java.util.Scanner;

public class Employee extends Person {

	int empId;
	double salary;
	Employee (){
		System.out.println("Default Constructor of Employee Class is Invoked");
	}
	Employee(String name, String gender, int age, int empId, double salary){
		super(name, gender, age);
		System.out.println("Parameterized Constructor of Employee Class is Invoked");
		this.empId=empId;
		this.salary=salary;
	}
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Employee ID");
		empId=sc.nextInt();
		super.accept();
		System.out.println("PLease Enter Employee Salary");
		salary= sc.nextDouble();
	}
//	@Override
//	public String toString() {
//		return super.toString()+"\n Employee Information \nempId=" + empId + "\nsalary=" + salary;
//	}
	
}
