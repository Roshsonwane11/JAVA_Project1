package METHODS;

public class Pattern_3 {
	public void numPattern(int row) {
	
		for (int line =1; line <=row; line++) {
			for (int num =1; num <=line ; num++) {
				System.out.print(num+ " ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		new Pattern_3().numPattern(10);
		
		

	}

}
