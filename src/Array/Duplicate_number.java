package Array;


public class Duplicate_number {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 4, 5, 1 , 5,4, 6,6, 3, 3};

		for (int index = 0; index < arr.length; index++) {
			for (int j =index+1; j<arr.length; j++) {
				
				if(arr[index] == arr[j]) {
					System.out.println("Duplicate elemnets of array: " + arr[index]);
					//break;
				}
			}
			

		}
		
		
	}

}
