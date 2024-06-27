package Array;

public class Asending_array2 {

	public static void main(String[] args) {
		// creating an instance of an array
		int[] arr = new int[] { 78, 34, 1, 3, 90, 34,6, 55, 20};
		System.out.println("Array elements after sorting:");
		// sorting logic Asending_array

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) // i jr j peksha motha
				{
					tmp = arr[i]; // 0 = i
					arr[i] = arr[j]; // i = j
					arr[j] = tmp; // j = 0
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}

}
