package day8;
//counting how many objects are created in the code using static variable because static variable is belongs to the class
public class Person {
	int age;
	static int count=0;
	String name, gender;
	Person(){
		System.out.println("Default Constructor Invoked");
		count++;
	
	}
}
