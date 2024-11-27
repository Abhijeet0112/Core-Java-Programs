package day9.multilevelinheritance;
//Example of Multilevel Innheritance
class Animal{
	void walk() {
		System.out.println("Animal is walking");
	}
	void eat() {
		System.out.println("Animal is Eating");
	}
}
class Dog extends Animal{
	@Override
	void walk() {
		System.out.println("Dog is Walking");
	}
	@Override
	void eat() {
		System.out.println("Dog is Eating");
	}
	void bark() {
		System.out.println("Dog is Barking");
	}
}
class Puppy extends Dog{
	void weep() {
		System.out.println("Puppy is Weeping");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.walk();
		a.eat();
		Dog d = new Dog();
		d.walk();
		d.eat();
		d.bark();
		Puppy p=new Puppy();
		p.walk();
		p.eat();
		p.bark();
		p.weep();

	}

}
