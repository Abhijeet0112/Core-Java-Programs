package day24.Comparator;

import java.util.Comparator;

public class SortByNameAndSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int nameCompare = o1.name.compareTo(o2.name);
		int salCompare = o1.salary-o2.salary;
		if (nameCompare==0) {
			return salCompare;
		}else {
			return nameCompare;
		}
	}

}
