package Mentor_ship_Program;

public class Add_charecter_sum {
	//addition of numbers from character array
	public static void main(String[] args) {
		//addition of number from charecter array
		char[] a = {'1', '2', '3', '4'};
		
	        int sum = 0;

	        // Iterate through the array
	        for (int i = 0; i < a.length; i++) {
	            // Convert character to integer and add to sum
	        	
	            sum = sum+ Character.getNumericValue(a[i]);
	        }

	        System.out.println("Sum: " + sum);

	}

}
