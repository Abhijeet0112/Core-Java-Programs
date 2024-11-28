package day1;

import java.util.Scanner;
//WTP to check greatest of two numbers or both are equal
public class If2 {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1>n2) {
			System.out.println("n1 : "+n1+" Is Greater than n2 :"+n2);
		}else if (n2>n1) {
		System.out.printf("n2 : %d Is Greater than n1 : %d",n2,n1);
		}else {
			System.out.println("Both the numbers are euqal");
		}
		sc.close();
	}
}
