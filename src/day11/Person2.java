package day11;

public class Person2 {
	String name;
	public Person2() {
		System.out.println("Defaullt constructor of person");
		System.out.println("Name is : " + name);
	}
	
	public Person2(String name) {
		this.name = name;
		System.out.println("Parameterized constructor of person");
		System.out.println("Name is : " + this.name);
		
	}

	//Instance Initializer Block
	{
		System.out.println("Iam Instance block");
		name="Mohit";
	}
	//name="Mohit";
	//System.out.println("Hello");
}
