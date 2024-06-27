package Patterns_ForLOOP;
import java.util.Iterator;
/*
 * 
*  
  * *  
    * * *  
      * * * *  
        * * * * *  
      * * * * 
    * * * 
  * * 
* 
 
 */
public class Pattern_14 {

	public static void main(String[] args) {
		for (int Line = 1; Line <= 5; Line++) {

			for (int space = 2; space <= Line; space++) {

				System.out.print("  ");
			}
			for (int ast = 1; ast <= Line; ast++) {
				System.out.print("* ");
				// System.out.print("");

			}

			System.out.println(" ");

		}

		for (int Line = 1; Line <= 4; Line++) {

			for (int space = 3; space >= Line; space--) {

				System.out.print("  ");
			}
			for (int ast = 4; ast >= Line; ast--) {
				System.out.print("* ");

			}
			System.out.print("");
			System.out.println("");

		}
	}

}
