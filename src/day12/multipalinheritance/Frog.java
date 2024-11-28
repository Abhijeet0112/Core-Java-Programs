package day12.multipalinheritance;

public class Frog extends Animal implements LandAnimal, WaterAnimal{

	@Override
	public void eat() {
		System.out.println("Frog is eating");
		
	}

	@Override
	public void swim() {
		System.out.println("Frog is swimming in water");
		
	}

	@Override
	public void walk() {
		System.out.println("Frog is walking on land");
		
	}

}
