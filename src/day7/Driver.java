package day7;

public class Driver {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.accept();
		p2.name="Abhijet Bhingardeve";
		p2.gender="Male";
		p2.age=30;
		p3.accept();
		p1.display();
		p2.display();
		p3.display();	
	}

}