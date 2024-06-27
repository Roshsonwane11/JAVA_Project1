package Patterns_ForLOOP;

public class Pattern_12 {
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 


 */
	public static void main(String[] args) {
		int num2 = 1;
		
		for (int line = 1; line <=6; line++) {

			for (int num =1; num <=line; num++,num2++) {//num2 ++ we can use two value for dec/inc

				System.out.print(num2 + " ");
				
			}
			
			System.out.println();
		}

	}

}
