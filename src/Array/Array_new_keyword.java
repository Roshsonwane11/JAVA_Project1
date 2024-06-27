package Array;

import java.util.Scanner;

public class Array_new_keyword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[5];
		System.out.println("Enter 5 Elements");
		
	/*	arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
	*/
		for(int index=0; index<=4; index++) {
			arr[index]= sc.nextInt();
		}
	/*
		System.out.print(arr[0]+ " ");
		System.out.print(arr[1]+ " ");
		System.out.print(arr[2]+ " ");
		System.out.print(arr[3]+ " ");
		System.out.print(arr[4]+ " ");
	*/
		for(int index=0; index<=4; index++) {
			System.out.print(arr[index] + ", ");
		}
		
		sc.close();
		

	}

}
