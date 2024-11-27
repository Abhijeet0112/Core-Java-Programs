package day7_constructor;

public class Driver3 {
// To check what is the problem we face while string accepted after integer value
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo("vikas","male",30);
		System.out.println(c);
		System.out.println(c1);
	}
}