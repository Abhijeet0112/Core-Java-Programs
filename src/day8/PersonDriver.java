package day8;
//counting objects created
public class PersonDriver {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println("Count of the object = "+Person.count);
	}

}
