package day8;

public class GymMembers {
	int id;
	String name;
	static String gymName;
	GymMembers(){
		System.out.println("Default Constructor Invoked");
	}
	public GymMembers(int id, String name) {
		this.id = id;
		this.name = name;
		gymName="Volasis Fitness";
	}
	@Override
	public String toString() {
		return "GymMembers [id= " + id + ", name= " + name + ", Gym Name= "+ gymName +"]";
	}
	
}
