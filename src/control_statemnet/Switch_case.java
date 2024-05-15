package control_statemnet;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int digit = sc.nextInt();// digit are single number
		/*
		switch(digit){
			case 0:System.out.println("ZERO");
			break;
			case 1 :System.out.println("ONE");
			break;
			case 2:System.out.println("Two");
			break;
			case 3:System.out.println("Three");
		    break;
			case 4:System.out.println("Four");
		    break;
			case 5:System.out.println("Nine");
		    break;
		    default:System.out.println("Invalid Digit");
		}
		*/
		
	//code using  else if statement
		if (digit==0) {
			System.out.println("ZERO");
		}else if(digit==1) {
			System.out.println("ONE");
		}else if(digit==1) {
			System.out.println("TWO");
		}else if(digit==1) {
			System.out.println("THREE");
		}else if(digit==1) {
			System.out.println("FOUR");
		}else if(digit==1) {
			System.out.println("SIX");
		}else if(digit==1) {
			System.out.println("NINE");
		}else {
		     System.out.println("Invalid Digit");
		}
    }
}

/*
  its check only equality.
  The switch statement or switch case in java is a multi-way branch statement.
  Based on the value of the expression given,
  different parts of code can be executed quickly. 
 executes all statements after the first match if a break statement is not present.
*/