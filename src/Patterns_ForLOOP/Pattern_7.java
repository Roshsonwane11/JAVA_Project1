package Patterns_ForLOOP;

/*          
                a 
               a b 
              a b c 
             a b c d 
 */
public class Pattern_7 {

	public static void main(String[] args) {

		for (int line = 1; line <= 4; line++) { 
			//space loop
			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}
			//alphabhet loop
			char ch = 'a';
			for (int character = 1; character <= line; character++) {
				// ch++;
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println("");
		}

	}

}
