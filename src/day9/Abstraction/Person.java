package day9.Abstraction;

public abstract class Person {
	private String name;
	int age;
	public Person() {
		System.out.println("Default Constructor of Person");
	}
	public Person(String name, int age) {
		super();
		System.out.println("Parameterized Constructor of person");
		this.name = name;
		this.age = age;
	}
	//function declaration
	abstract void calculateSalary();
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
