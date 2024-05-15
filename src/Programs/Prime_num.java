package Programs;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i = 2;
        boolean flag = false;
        while (i <= n / 2) {
            // condition for nonprime number
            if (n % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
	
	}


