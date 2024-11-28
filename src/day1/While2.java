package day1;

import java.util.Scanner;

public class While2 {
//WAP to print first n natural numbers
	public static void main(String[] args) {
		int n , i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		n=sc.nextInt();
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
