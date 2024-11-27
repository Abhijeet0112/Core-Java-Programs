package day7_constructor;

public class Employee {
	int emp_id,salary,age;
	String name, gender;
	Employee(){
		System.out.println("Default Constructor invoked");
		emp_id=1;
		name = "Abhijeet bhingardeve";
		gender="male";
		salary=20000;
		age= 30;
	}
	Employee(int emp_id, String name, String gender, int salary, int age ){
		this.age=age;
		this.emp_id=emp_id;
		this.gender=gender;
		this.salary=salary;
		this.name=name;
	}
	@Override
	public String toString() {
		return "~~~Employee information~~~ \nemp_id=" + emp_id + ", \nsalary=" + salary + ", \nage=" + age + ", \nname=" + name + ", \ngender="
				+ gender;
	}
	
}
