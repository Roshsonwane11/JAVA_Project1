package Programs;

import java.util.Scanner;

public class Fractorial_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numebr");		
        int num = sc.nextInt();
       
	/*
       int x =1;
       while(num>=1) {
    	   x= num*x;
    	   num = num-1;
       }
       System.out.println("Fractorial is  " + x);
       */
        
        int i = 1;
        int factorial = 1;
        
        while (i <= num) {
        	
        	factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
	}

}
