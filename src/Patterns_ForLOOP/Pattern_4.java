package Patterns_ForLOOP;
/*
   1 
  1 2 
 1 2 3 
1 2 3 4 
 */
public class Pattern_4 {

	public static void main(String[] args) {
		for (int line = 1; line <= 4; line++) {

			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}

			for (int num = 1; num <= line; num++) {

				System.out.print(num + " ");
			}
			System.out.println("");
		}

	}

}
