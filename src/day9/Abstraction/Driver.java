package day9.Abstraction;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("abhijeet",30,30000);
		e1.calculateSalary();
		System.out.println(e1);
		PartEmployee partemployee=new PartEmployee("vikas",25,1000,2);
		partemployee.calculateSalary();
		System.out.println(partemployee);
	Person person= new PartEmployee("Ishan",20,1500,5);
	person.calculateSalary();
	System.out.println(person);
	}
}
