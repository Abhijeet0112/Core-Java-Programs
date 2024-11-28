package day1;

import java.util.Scanner;

public class While3 {
//WAP to print factorial of n
	public static void main(String[] args) {
		int n , i, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		n=sc.nextInt();
		i=n;
		while(i>=1) {
			fact=fact*i;
			i--;
		}
System.out.printf("Factorial of %d = %d",n,fact);

	}
}
