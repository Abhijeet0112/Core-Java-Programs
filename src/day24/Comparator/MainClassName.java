package day24.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassName {

	public static void main(String[] args) {
		Employee e1= new Employee(5, "Rajiv", 350);
		Employee e2= new Employee(1, "Vikas", 500);
		Employee e3= new Employee(3, "Sushant", 600);
		Employee e4= new Employee(2, "Ramesh", 350);
		Employee e5= new Employee(4, "Vikas", 800);
		Employee e6= new Employee(6, "Bharat", 1000);
		Employee e7= new Employee(7, "Bharat", 1250);
		Employee e8= new Employee(8, "Bharat", 900);
		ArrayList<Employee> employee = new ArrayList<>();
		employee.add(e1);
		employee.add(e5);
		employee.add(e4);
		employee.add(e3);
		employee.add(e2);
		employee.add(e8);
		employee.add(e7);
		employee.add(e6);
		
		System.out.println("Befor Sorting");
		for(Employee e : employee) {
			System.out.println(e);
		}
		
		SortByName sort1 = new SortByName();
		
		Collections.sort(employee, sort1);
		
		System.out.println("\n\nAfter Sorting by name in ascending");
		for(Employee e : employee) {
			System.out.println(e);
		}

		

	}

}
