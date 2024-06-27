package METHODS;
public class Pattern_5 {
	
public void alphabhetPattern(int row) {
	
	for (int line =1; line <=row; line++) {
		for (int space =row-1; space >=line; space--) {
			System.out.print(" ");
		}
		char ch='a';
		for (char charecter =1; charecter <=line; charecter++) {
			System.out.print(ch+ " ");
		}
		System.out.println();
	}

}
	public static void main(String[] args) {
		
		new Pattern_5().alphabhetPattern(7);
		

	}

}
