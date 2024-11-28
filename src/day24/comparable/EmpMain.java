package day24.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {

	public static void main(String[] args) {
		Employee e1= new Employee(5, "Rajiv", 350);
		Employee e2= new Employee(1, "Vikas", 500);
		Employee e3= new Employee(3, "Sushant", 600);
		Employee e4= new Employee(2, "Ramesh", 350);
		Employee e5= new Employee(4, "Vikas", 800);
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(e1);
		employee.add(e5);
		employee.add(e4);
		employee.add(e3);
		employee.add(e2);
		
		for(Employee e : employee) {
			System.out.println(e);
		}
		
		Collections.sort(employee);
		
		System.out.println("Sorting by salary :");
		for(Employee e : employee) {
			System.out.println(e);
		}
	}

}
