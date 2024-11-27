package day16;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsEx1 {
//Accept only unique value not repeated and are unordered no index no
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(50);
		numbers.add(56);
		numbers.add(100);
		numbers.add(15);
		numbers.add(50);
		numbers.add(45);
		numbers.add(5);
		numbers.add(5);
		numbers.add(5);
		numbers.add(7);
		numbers.add(62);
		numbers.add(9);
		
		System.out.println("Size of Hash set : "+numbers.size());
		System.out.println("My Hash Set : "+numbers);
		
		
		//TreeSet - Accept values in Ascending order
		
		TreeSet<String> name = new TreeSet<>();
		
		name.add("Abhijeet");
		name.add("Vikas");
		name.add("Amar");
		name.add("Amar");
		name.add("Kiran");
		name.add("Shekhar");
		name.add("Swarup");
		name.add("Swarup");
		name.add("Pranita");
		name.add("Vikas");
		
		System.out.println("Size of Treeset : "+name.size());
		System.out.println("My TreeSet : "+name);
		
		TreeSet<String> mynewnames=(TreeSet<String>) name.clone();
		System.out.println("Size of Treeset : "+mynewnames.size());
		System.out.println("My TreeSet : "+mynewnames);
	}

}
