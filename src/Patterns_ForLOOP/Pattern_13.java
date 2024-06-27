package Patterns_ForLOOP;
/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

 */
public class Pattern_13 {

	public static void main(String[] args) {

		for (int line = 1; line <= 6; line++) {

			for (int num = 1; num <= line; num++) {
				if ((line + num) % 2 == 0) { // if line+num %2==0 aata hai to print 1 othetwise prinyt 0
					System.out.print("1" + " ");
				} else {
					System.out.print("0" + " ");
				}

			}
			System.out.println();
		}

	}

}
