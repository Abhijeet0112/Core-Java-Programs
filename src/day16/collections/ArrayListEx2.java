package day16.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(5);
		myList.add(52);
		myList.add(1);
		myList.add(60);
		myList.add(70);
		myList.add(90);
		myList.add(70);
		myList.add(6);
		myList.add(50);
		System.out.println("Mylist befor sorting is : "+myList);
		Collections.sort(myList);
		System.out.println("Mylist after sorting is : "+myList);
	}

}
