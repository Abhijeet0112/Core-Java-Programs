package day6;

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);//Here Address of the object of the Person class created on Heat is Printed
		//Assign values to the field
		p1.age=30;
		p1.gender="male";
		p1.name="Abhijeet Bhingardeve";
		System.out.println("Person 1 Information");
		System.out.println("Name : "+p1.name);
		System.out.println("Gender : "+p1.gender);
		System.out.println("Age : "+p1.age);
	}

}
