package Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Inputs ");
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("enter a number");
		
		for (int index = 0; index<arr.length; index++) {
			
			arr[index] = sc.nextInt();
		}
		for (int i = 0; i <arr.length; i++) {
			
			if (arr[i] >=10) {
				
				if (arr[i]%2 == 0 || arr[i]%3 == 0 || arr[i]%5 == 0 || arr[i]%7 == 0) {
					
					System.out.println(arr[i] + " Given number is not prime");
				} else {
					System.out.println(arr[i] + " Number is prime");
				}
				
			} 
			else if (arr[i]<10) {
				
				if(arr[i]==2 || arr[i]==3 || arr[i]==5 || arr[i]==7) {

					System.out.println(arr[i] + " Given Number is Prime");
				}
			}
		}

	}

}
