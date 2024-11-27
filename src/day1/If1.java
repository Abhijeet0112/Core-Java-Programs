package day1;

import java.util.Scanner;
//WTP to check weather entered number is odd or even
public class If1 {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number : ");
	n=sc.nextInt();
	if(n%2==0) {
		System.out.println("Entered Number is Even");
	}
	System.out.println("Entered Number is Odd");
	sc.close();
}
}
