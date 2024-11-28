package day24.comparable;

public class Employee implements Comparable<Employee>{
	int eid;
	String name;
	int salary;
	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
//	//For Ascending
//	@Override
//	public int compareTo(Employee o) {
//		return this.salary-o.salary;
//	}
	
	//for Descending
//	@Override
//	public int compareTo(Employee o) {
//		return o.salary-this.salary;
//	}
	
	//Ascending by name 
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
}
