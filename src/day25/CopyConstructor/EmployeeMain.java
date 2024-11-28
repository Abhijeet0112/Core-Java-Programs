package day25.CopyConstructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1, "Satish", 15000);
		System.out.println(e1);
		//Employee e2 =e1;//Refrence Trap
		
		//To create a copy of object call copy constructor
		
		Employee e2= new Employee(e1);
		e2.setSalary(25000);
		e2.setEid(2);
		System.out.println(e1);
		System.out.println(e2);
	}

}
