package Programs;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int n = sc.nextInt();
	       int  i =2; 
		 if(i <= n / 2 && n % i == 0){  
          System.out.println(n+" is not prime number");   
       }else {
    	   System.out.println(n+" is a prime number"); 
       }
}

}
