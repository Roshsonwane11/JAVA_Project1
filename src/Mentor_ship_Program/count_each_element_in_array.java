package Mentor_ship_Program;

public class count_each_element_in_array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 3, 3, 3, 1 };

		// Initialize an array to keep track of visited elements
		boolean[] visited = new boolean[arr.length];

		// Iterate through each element in the array
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				
				int count = 1; // Initialize count for current element
				
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true; 
						count++; // Increment count
					}
				}
				// Print the element and its count
				System.out.println(arr[i] + "=" + count);
			}
		}
	}
}
