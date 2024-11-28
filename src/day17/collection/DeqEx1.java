package day17.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeqEx1 {

	public static void main(String[] args) {
		Deque<Integer> q = new ArrayDeque<>();
		//Reference of base class object of derived class Dynamic Method Dispatch
		q.add(20);
		q.add(21);
		q.add(22);
		q.add(23);
		q.add(24);
		q.add(25);
		q.add(26);
		q.add(2);
		q.add(9);
		
		q.offer(34);
		
		System.out.println(q);
		q.addFirst(500);
		q.addLast(1000);
		System.out.println(q);
		
		// poll() and remove() methods are same
		System.out.println("Using For Loop : ");
		for (Integer i : q) {
			System.out.println(i);
		}
		System.out.println("Using For Each Loop : ");
		q.forEach((k)->{
			System.out.println(k);
		});
	}

}
