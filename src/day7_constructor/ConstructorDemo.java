package day7_constructor;

public class ConstructorDemo {
	//fields
		String name;
		String gender;
		int age;
	//Default Constructor
		ConstructorDemo(){
			System.out.println("Default Constructor invoked");
			name="abhijeet";
			gender="male";
			age=30;
		}
	//Parameterized Constructor
		ConstructorDemo(String n, String g, int a){
			name=n;
			gender=g;
			age=a;
		}
		@Override
		public String toString() {
			return "~~~ Person Information ~~~ \nname=" + name + "\ngender=" + gender + "\nage=" + age ;
		}
		
}
