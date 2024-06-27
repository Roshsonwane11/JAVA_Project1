package Array;

public class Misisng_series {

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5,7,8,10,24};
        //1st loop always for index of arary
		for (int index = 0; index<arr.length-1; index++) {//always use index<arr.length-1
   
			for (int j = arr[index]; j < arr[index + 1]; j++) {

				if (arr[index] != j) {

					System.out.print(j + " ");

				}

			}
		}

	}

}
