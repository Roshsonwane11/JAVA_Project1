package METHODS;

import java.util.Scanner;

import METHODS.Return_Type.palindrom_return_type;

public class Pattern_star {

	public void drawPattern(int rows) {
		for (int Line =0; Line <=rows; Line++) {
			for (int space = rows-1; space>=Line; space--) {
				System.out.print(" ");
			}
			for (int ast =0; ast < Line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enetr a rows");
    int rows = sc.nextInt();
    new Pattern_star().drawPattern(rows);	
		//new Star_Pattern().DrawPattern(10);// by object
sc.close();     
	}

}
