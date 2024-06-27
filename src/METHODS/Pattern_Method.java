package METHODS;

public class Pattern_Method {

	public void starPattern(int row) {
      
		for (int line=1; line<=row; line++) {
			
			for(int ast=1; ast<=line; ast++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}
	
	public static void main(String[] args) {
		new Pattern_Method().starPattern(10);
	}

}
