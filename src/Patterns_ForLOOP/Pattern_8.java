package Patterns_ForLOOP;
/*
         1  
        a  b  
       1  2  3  
      a  b  c  d   
*/
public class Pattern_8 {

	public static void main(String[] args) {
		for (int line = 1; line <= 4; line++) {
			for (int space = 3; space >= line; space--) {
				System.out.print(" ");
			}
			if (line % 2 == 0) {
				char ch = 'a';
				for (int character = 1; character <= line; character++) {
					// ch++;
					System.out.print(ch + "  ");
					ch++;
				}
				System.out.println();
			} else {
				for (int num = 1; num <= line; num++) {
					System.out.print(num + "  ");

				}
				System.out.println();
			}
		}

	}

}
