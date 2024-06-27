package Hacker_rannk;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
	
		        Scanner scan = new Scanner(System.in);
		        System.out.println("enter a number");
		        
		        int i = scan.nextInt();
		        Double d= scan.nextDouble();
		       
		        scan.nextLine();// This line consumes the newline character left by the previous nextDouble() call. 
		        //This is necessary because nextDouble() does not consume the newline character after reading the double value, 
		        //so nextLine() is used to consume it.
		        
		        String s= scan.nextLine();
		    
		        // Write your code here.

		        System.out.println("String: " + s);
		        System.out.println("Double: " + d);
		        System.out.println("Int: " + i);
		    }
		


	}


