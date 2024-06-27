package Mentor_ship_Program;

public class DEMo1 {

	public static void main(String[] args) {

		int n = 5;
		for (int line = 1; line <= n; line++) {
			for (int space = n; space > line; space--) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <= 2 * n - 1; ast++) {
				if (ast == 1 || line == n || (ast == 2 * line - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// lower part
		/*
		for (int line = n - 1; line >= 1; line--) {
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <= 2 * line - 1; ast++) {
				if (ast == 1 || (ast == 2 * line - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
	}
}
