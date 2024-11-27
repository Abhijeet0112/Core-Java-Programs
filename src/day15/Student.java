package day15;

public class Student {
	int rollNo;
	String name;
	
	public Student() {
		System.out.println("Default constructor of student");
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	

}
