package day7_constructor;

public class EmpDriver {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(2,"Vikas Shinde","male",30000,31);
		System.out.println(e);
		System.out.println(e1);
	}

}
