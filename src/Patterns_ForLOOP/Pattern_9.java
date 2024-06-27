package Patterns_ForLOOP;
/*  a  
  *  *  
 a  b  c  
*  *  *  * 
 */
public class Pattern_9 {
	public static void main(String[] args) {
		for (int line = 1; line <= 4; line++) {
			//loop for space
			for (int space = 3; space >= line; space--) {
				  
				System.out.print(" ");
			}
			if (line % 2 != 0) {
				//loop for char
				char ch = 'a';
				for (int character =1; character <= line; character++) {
					// ch++;
					System.out.print(ch+ "  ");
					ch++;
				}
				System.out.println();
			} else {
				//loop for num
				for (int num = 1; num <= line; num++) {
					System.out.print("*  ");
				}
				System.out.println();
			}
		}

	}

}
