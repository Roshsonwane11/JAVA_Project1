package Hacker_rannk;

import java.util.Scanner;

public class Program2 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter number");
		int N = scanner.nextInt();
		
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
             
             if(N % 2 == 0 && (N > 1 && N < 6 || N > 20)){
                System.out.println("Not Weird");
            }
             else {
                 System.out.println("Weird");
        }

	}

}
