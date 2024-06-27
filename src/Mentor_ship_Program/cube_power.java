package Mentor_ship_Program;

import java.util.Scanner;

public class cube_power {

	public static void main(String[] args) {
		//Write a Java program that reads a number and displays the square, cube, and fourth power.
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
      
        int square = number * number;
        int cube = number * number * number;
        int fourthPower = number * number * number * number;
        
        System.out.println("Square of " + square);
        System.out.println("Cube of " + cube);
        System.out.println("Fourth power of "+ fourthPower);
    	sc.close();
	}

}
