package Mentor_ship_Program;

public class MaxiMum_Value {

	public static void main(String[] args) {
		int[] arr = {1, 2,3,4 ,88, 99};
		
	
		
		int MaxNum= 0;
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
			if(arr[i] >  MaxNum)
			MaxNum = arr[i];
	
			
		}
		System.out.println();
		System.out.println("Maximun number form array: " + MaxNum);

	}

}
