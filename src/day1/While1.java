package day1;

import java.util.Scanner;

public class While1 {
//Write a program to print 1st n natural numbers in reverse order
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		n=sc.nextInt();
		while(n>=1) {
			System.out.println(n);
			n--;
		}
		sc.close();
	}

}
