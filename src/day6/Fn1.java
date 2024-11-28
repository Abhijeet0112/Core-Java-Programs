package day6;

import java.util.Scanner;

public class Fn1 {
	//defining function
	static void sum() {
		int n1, n2, add;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		add=n1+n2;
		System.out.println(n1+"+"+n2+"="+add);
	}
	static int factorial(int n) {
		int fact=1;
		System.out.println("Calculating Factorial");
		for(int i =n;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		//calling sum function
		sum();
		System.out.println(factorial(5));
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate Factorial");
		number= sc.nextInt();
		System.out.println("The Faactorial of "+number+" is = "+factorial(number));
	}

}
