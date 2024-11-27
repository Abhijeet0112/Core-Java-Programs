package day14;

public class Mainclass {

	public static void main(String[] args) {
//		MyinterfaceImplementation m1= new MyinterfaceImplementation();
//		m1.sayHello();
//		Myinterface m1 = new Myinterface() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("Hello from Annonimus class");
//				
//			}
//		};
//		m1.sayHello();
		//Lambda expression
		Myinterface m1 = () -> System.out.println("hello abhijeet");
		m1.sayHello();
		
		Addition add =(int a, int b) ->{
			System.out.println("Overriding methods in Addition interface");
			return (a+b);
		};
		System.out.println("a+b= "+add.sum(5, 9));
		System.out.println("A+B= "+add.sum(58, 96));
		Cube cube =(n) -> (n*n*n);//ekch expression aslyas one line mde ase lihave 
		System.out.println("Cube of No : "+cube.cube(2));
	}

}
