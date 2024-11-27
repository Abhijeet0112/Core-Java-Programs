package day7_constructor;
//Using this keyword
public class ConstructorDemo2 {
	//fields
		String name;
		String gender;
		int age;
	//Default Constructor
		ConstructorDemo2(){
			System.out.println("Default Constructor invoked");
			name="abhijeet";
			gender="male";
			age=30;
		}
	//Parameterized Constructor
		ConstructorDemo2(String name, String gender, int aage){
			this.name=name;
			this.gender=gender;
			this.age=age;
		}
		@Override
		public String toString() {
			return "~~~ Person Information ~~~ \nname=" + name + "\ngender=" + gender + "\nage=" + age ;
		}
		
}
