package Array;

public class Copy_x_to_y_revrse {

	public static void main(String[] args) {
		int[] arrayX = { 1, 2, 3, 4, 5 };

		int[] arrayY = new int[arrayX.length];
		System.out.println("Arrayx from y");

		for (int i = 0; i < arrayX.length; i++) {
			arrayY[i] = arrayX[i];
			
		}
		for(int index= arrayY.length-1; index>=0; index--) {
			System.out.print(arrayY[index]+ " ");
		}

	}

}
