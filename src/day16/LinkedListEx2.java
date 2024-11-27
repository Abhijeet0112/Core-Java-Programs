package day16;

import java.util.LinkedList;

class Student {
	int rollNo;
	String name;
	String gender;
	public Student(int rollNo, String name, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
	}
	
}

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList <Student> students = new LinkedList<>();
		students.add(new Student(1, "Abhijeet", "Male"));
		Student s1 = new Student(2, "Vikas", "Male");
		students.add(s1);
//		for(Student Student : students) {
//			System.out.println("Name of the students : "+ Student.name);
//			System.out.println("Name of the students : "+ Student.gender);
//		}
		System.out.println("~~~Students Information~~~");
		students.forEach(student ->{
			System.out.println("Name of the students : "+ student.rollNo);
			System.out.println("Name of the students : "+ student.name);
			System.out.println("Name of the students : "+ student.gender);
		});
	}

}
