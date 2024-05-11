package Scanner_Class;

import java.util.Scanner;

public class User_input {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int  number=sc.nextInt();
		
		if(number%3==0 && number%5==0) {
			
			System.out.println("HAHAHAHAH");
			
		}else if(number%5==0){
			
			System.out.println("Number divisible by 5");
			
		}else if(number%3==0) {

			System.out.println("Number divisible by 3");
		}
	}

}



/*
 * if else channing
 
//all condition run nhi hogi kabi bi always check 1st condition
And && = Returns true if both statements are true. if(a<b && a%2==0)
OR || = 	Returns true if one of the statements is true if(a<b && a%2==0)

a%2==0 = even num modulues, divisible


*/