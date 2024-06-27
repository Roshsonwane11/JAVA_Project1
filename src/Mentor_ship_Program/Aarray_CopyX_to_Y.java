package Mentor_ship_Program;


import java.util.Scanner;

public class Aarray_CopyX_to_Y {

	public static void main(String[] args) {
		// copy 5 elements from one array to other array by taking user inputs
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Arrayx from y");
		System.out.print("Enter array elements:  ");

		int[] array_X = new int[5];
        int[] array_Y = new int[array_X.length];
		for (int i = 0; i < array_X.length; i++) {
			array_X[i] = sc.nextInt();
			array_Y[i] =array_X[i];
			System.err.print(array_Y[i]+ " ");
		}
		
		sc.close();

	}

}
