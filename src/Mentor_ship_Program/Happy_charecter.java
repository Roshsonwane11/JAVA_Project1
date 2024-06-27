package Mentor_ship_Program;

public class Happy_charecter {
  

	public class FindHappyNumberFromArray {
	    public static void main(String[] args) {
	        // Input array
	        int[] array = {1, 2, 3, 2, 4, 5};
	        
	        // Find the happy number
	        int happyNumber = findHappyNumber(array);
	        
	        // Print the happy number (if found)
	        if (happyNumber != -1) {
	            System.out.println("Happy Number: " + happyNumber);
	        } else {
	            System.out.println("No Happy Number found");
	        }
	    }
	    
	    // Method to find the happy number from the array
	    public static int findHappyNumber(int[] array) {
	        int happyNumber = -1;
	        
	        // Iterate through the array to find the happy number
	        for (int i = 0; i < array.length - 1; i++) {
	            // Check if the current element equals the next element
	            if (array[i] == array[i + 1]) {
	                happyNumber = array[i]; // Found the happy number
	                break; // Exit the loop since we found the happy number
	            }
	        }
	        
	        return happyNumber;
	    }
	}

}

