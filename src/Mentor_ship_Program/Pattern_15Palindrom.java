package Mentor_ship_Program;

public class Pattern_15Palindrom {

	public static void main(String[] args) {
	
		for (int line = 1; line <=6; line++) {
			for (int space =6; space>=line; space--) {
				System.out.print("  ");
			}
			for (int num = line; num >=2; num--) {
				System.out.print(num + " ");
			}
			
			for (int num =1; num <=line;num++) {
				System.out.print(num+ " ");
			}
			
			System.out.println();
		}

	}

}
