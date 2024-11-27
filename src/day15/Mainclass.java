package day15;

public class Mainclass {

	public static void main(String[] args) {
		Student s = new Student(1,"Abhijeet");
		Student[] students = new Student[5];
		students[0]=s;
		students[1]=new Student(2,"Amar");
		System.out.println(students.length);
		for(Student s2:students) {
			System.out.println(s2);
		}
		
		
		
		
		Student[] students1 = {new Student (1,"Vikas"),new Student(2,"Sushant"),new Student(3,"Nilesh"),new Student(4,"Vishal"),new Student(5,"Rohit")};
		System.out.println("The length of students1 array : "+students1.length);
		//For Each to print array
		for(Student s1:students1) {
			System.out.println(s1.name);
		}
	}
 
}