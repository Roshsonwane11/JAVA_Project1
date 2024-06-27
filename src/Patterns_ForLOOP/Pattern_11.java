package Patterns_ForLOOP;
/*
     1  
    2 2  
   3 3 3  
  4 4 4 4  
 5 5 5 5 5   
 */
public class Pattern_11 {

	public static void main(String[] args) {
		for (int line = 1; line<=5; line++) {
			
			for (int space =5; space>=line; space--) {
				System.out.print(" ");
			}
			
			for (int num = 1; num <=line; num++) {
				
				System.out.print(line + " ");//line
			}
			System.out.println(" ");
			
			
		}

	}

}
