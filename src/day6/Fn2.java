package day6;

import java.util.Scanner;

public class Fn2 {
	static void printMessage(String name) {
		System.out.println("Welcome "+ " "+name+"  ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Name");
		String userName= sc.nextLine();
		printMessage(userName);

	}

}
