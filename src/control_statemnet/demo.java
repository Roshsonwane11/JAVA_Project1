package control_statemnet;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int digit = sc.nextInt();
		switch(digit){
			case 0:System.out.println("ZERO");
			
			case 1 :System.out.println("ONE");
			
			case 2:System.out.println("Two");
			
			case 3:System.out.println("Three");
		    break;
			case 4:System.out.println("Four");
		    break;
			case 5:System.out.println("Nine");
		    break;
		    default:System.out.println("Invalid Digit");
		}
			
	}
}
	
	
/*
 * its check only equality.
 
*/
 

