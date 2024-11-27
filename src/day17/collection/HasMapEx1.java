package day17.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HasMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "One");
		myMap.put(50, "Two");
		myMap.put(4, "Three");
		myMap.put(7, "Six");
		myMap.put(9, "Fifty");
		myMap.put(9, "Three");
		myMap.put(2, "Four");
		myMap.put(3, "Hundred");
		
		System.out.println(myMap);
		
		myMap.put(12, "Seventy");
		System.out.println(myMap);
		System.out.println("My hashmap Size : "+myMap.size());
		System.out.println(myMap.get(50));
		
		myMap.forEach((k,v)->System.out.println(k+" "+v));
		myMap.forEach((k,v)->System.out.println(k));
		
		//TreeMap
		TreeMap <Integer, String> students = new TreeMap<>();
		
		System.out.println(students.put(10, "Abhijeet"));
		System.out.println(students.put(10, "Vikas"));
		students.put(20, "Ganesh");
		students.put(21, "Amar");
		students.put(23, "Dhiraj");
		students.put(25, "Rohit");
		students.put(28, "Kalyani");
		students.put(27, "Pranita");
		students.put(29, "Isha");
		System.out.println("Students in Treemap"+students);
		System.out.println("Deleted Student is : "+students.remove(25));
		students.replace(20, "Mr. Pakys");
		System.out.println("Students in Treemap"+students);
		
//		for (Entry<Integer, String> m:students.entrySet()) {
//			System.out.println("Key is : "+m.getKey());
//			System.out.println("value is : "+m.getValue());
//		}
		
		students.forEach((k,v)->{
			System.out.println("Key is : "+k);
			System.out.println("value is : "+v);
		});
	}

}
