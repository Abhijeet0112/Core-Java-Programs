package day11.aggregation;

public class MainClass {

	public static void main(String[] args) {
		Student student1 = new Student("Abhijeet Bhingardeve", 30, new Address("India", "Maharashtra", "Shirala", "415 408"));
		System.out.println(student1);
		Address address = new Address("India", "Maharashatra", "Kolhapur", "415 007");
		Student student2= new Student("Vikas Shinde", 30, address);
		System.out.println(student2);
}

}
