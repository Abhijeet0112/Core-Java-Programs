package day11.aggregation;

public class Student {
	//Fields
	String name;
	int age;
	Address address;
	public Student(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
