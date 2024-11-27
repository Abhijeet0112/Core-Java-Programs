package day1;

import java.util.Scanner;

public class For1 {
//WAP to print only odd numbers till n
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number n :");
		n=sc.nextInt();
		for(int i = 1; i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
