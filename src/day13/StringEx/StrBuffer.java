package day13.StringEx;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		System.out.println("Empty String is : "+s);
		s.append("Hello ");
		System.out.println("String is : "+s);
		s.insert(6, "JAVA");
		System.out.println("After insert : "+s);
		System.out.println("The Capacity of my string is : "+s.capacity()); // bbydefault capacity is 16
		s.append(". I am learning");
		System.out.println(s);
		System.out.println("The Capacity after appending of my string is : "+s.capacity());
		//formula to calculate capacity = (default size*2)+2
	}

}
