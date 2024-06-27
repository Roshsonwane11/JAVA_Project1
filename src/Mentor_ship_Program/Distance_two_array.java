package Mentor_ship_Program;

import java.util.Scanner;

public class Distance_two_array {

	public static void main(String[] args) {
		//write a basic Java program to find the distance between two elements in the
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number form array");

		int[] arr = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Differences between each pair of elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				int diff = arr[j] - arr[i];
				
				System.out.println("Difference between " + arr[j] + " and " + arr[i] + " is: " + diff);
			}
		}
		sc.close();
	}
}
