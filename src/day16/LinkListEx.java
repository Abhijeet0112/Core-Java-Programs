package day16;

import java.util.LinkedList;

public class LinkListEx {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Berry");
		fruits.add("Mango");
		fruits.add("Berry");
		fruits.add("Jackfruits");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Watermellon");
		System.out.println("I have "+fruits.size()+" in my refrigerator");
		System.out.println("Fruits are : "+fruits);
		String rem =fruits.remove(1);
		System.out.println("I ate : "+ rem);
		System.out.println("Fruits are : "+fruits);
		fruits.forEach(fruit->System.out.println(fruit));
	}

}
