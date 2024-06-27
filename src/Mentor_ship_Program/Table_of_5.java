package Mentor_ship_Program;

import java.util.Scanner;

public class Table_of_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number ");
		
		int MuliplicationNum= sc.nextInt();
		
		System.out.println("Multiplication Table for " + MuliplicationNum );
        //5 1-10 and then *
		
		 for (int i = 1; i <= 10; i++) {
			 
	            int sum = MuliplicationNum * i;
	            
	            System.out.println(sum);
	        }
		 sc.close();
	}

}
