package Array;

public class sum_of_elements_array {
	public static void main(String[] args) {
		
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i<=numbers.length-1; i++) {
            sum = sum+ numbers[i];
          
        }
          System.out.println("Sum of array elements: " + sum);//write syso here
		}
	}


