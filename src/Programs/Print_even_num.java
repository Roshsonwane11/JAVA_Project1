package Programs;

import java.util.Scanner;

public class Print_even_num {

	public static void main(String[] args) {
	
		/*
		int i =1;
		while(i<101) {
			if(i%2==0) { // for odd (i%2!=0)
				System.out.print(i + " ");
			}
			i = i+1;
		}*/
		
	    //by scanner
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num = sc.nextInt();
	    
	    if (num % 2 == 0) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
	    
	  
	   
	}
	
}
		

	


