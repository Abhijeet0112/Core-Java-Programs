package day9.Abstraction;

public class PartEmployee extends Employee {
	private double dailyWages;
	private double totalDays;
	public PartEmployee() {
		System.out.println("Default constructor of PartEmployee class");
	}
	public PartEmployee(String name, int age,double dailyWages, double totalDays) {
		super(name, age, 0);
		System.out.println("Parameterized constructor of PartEmployee class");
		this.dailyWages=dailyWages;
		this.totalDays=totalDays;
	}
	
	@Override
	void calculateSalary() {
		salary=dailyWages*totalDays;
	}
	@Override
	public String toString() {
		return super.toString()+"PartEmployee [dailyWages=" + dailyWages + ", totalDays=" + totalDays + "]";
	}
	
	
}
