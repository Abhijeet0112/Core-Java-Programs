package day9.Abstraction;

public class Employee extends Person {
	double salary;
	public Employee() {
		System.out.println("Default Constructor of Employee");
	}
	public Employee(String name, int age, double salary) {
		super(name, age);
		System.out.println("Parameterised Constructor of Employee");
		this.salary=salary;
	}
	void calculateSalary() {
		if(salary<15000) {
			System.out.println("No TDS Deducted");
		}else {
			System.out.println("10% TDS is Deducted from your salary");
			salary= salary-(0.1*salary);
		}
	}
	void display() {
		System.out.println("name");
	}
	@Override
	public String toString() {
		return super.toString()+ "Employee [salary=" + salary + "]";
	}
	
}
