package day15.collections;

import java.util.*;

public class DriverClass {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println("Size of my LinkedList is : "+names.size());
		names.add("Abhijeet");
		names.add("Vikas");
		names.add("Amar");
		names.add("Ishan");
		names.add("Rohit");
		names.add("Dhiraj");
		System.out.println("Names are : "+names);
		System.out.println("Size of my LinkedList is : "+names.size());
		names.add(1, "Isha");
		System.out.println("Names are : "+names);
		System.out.println("Size of my LinkedList is : "+names.size());
		
		
		ArrayList <String> myFavNames = new ArrayList<>();
		myFavNames.add("Ishan");
		myFavNames.add("Vikas");
		myFavNames.add("Abhijeet");
		myFavNames.add("Sujit");
		
		names.addAll(myFavNames);
		System.out.println("Names are : "+names);
		System.out.println("Size of my LinkedList is : "+names.size());
		
		String sm = names.remove(1);
		System.out.println(sm);
		
		System.out.println("Names are : "+names);
		System.out.println("Size of my LinkedList is : "+names.size());
		
		System.out.println("Names are using for loop : ");
		for(String name :names) {
			System.out.println(name);
		}
		
		System.out.println("Names are using Iterator : ");
		Iterator<String> it = names.iterator();
		int i=1;
		while(it.hasNext()) {
			System.out.println(i +". "+it.next());
			i++;
		}
		System.out.println("NAmes are using for each loop :");
		names.forEach(n-> System.out.println(n));
	}

}
