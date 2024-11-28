package day25.CopyConstructor;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 =arr1; //here one array that is arr1 is created and in stack it store address 100 again when we create second array it store another address but point to the 1st array that is arr1
//		System.out.print("Array one is : ");
//		for (int a: arr1) {
//			System.out.print(a+"\t");
//		}
//		System.out.print("\nArray two is : ");
//		for (int a: arr2) {
//			System.out.print(a+"\t");
//		}
//		
//		arr2[2]=30;
//		arr2[4]=50;
//		
//		System.out.print("\n\nArray one is : ");
//		for (int a: arr1) {
//			System.out.print(a+"\t");
//		}
//		System.out.print("\nArray two is : ");
//		for (int a: arr2) {
//			System.out.print(a+"\t");
//		}/
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, 5); //to avoid above confusion or same address in stack copyOf() method is used
		System.out.print("Array one is : ");
		for (int a: arr1) {
			System.out.print(a+"\t");
		}
		System.out.print("\nArray two is : ");
		for (int a: arr2) {
			System.out.print(a+"\t");
		}
		
		arr2[2]=30;
		arr2[4]=50;
		
		System.out.print("\n\nArray one is : ");
		for (int a: arr1) {
			System.out.print(a+"\t");
		}
		System.out.print("\nArray two is : ");
		for (int a: arr2) {
			System.out.print(a+"\t");
		}
	}

}
