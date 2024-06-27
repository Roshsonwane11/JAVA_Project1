package Mentor_ship_Program;

public class print_only_even_numbers_using_continue {

	public static void main(String[] args) {
		
		System.out.println("Printing even numbers (skipping odd numbers):");

        for (int i = 1; i <= 10; i++) {
            if (i%2!= 0) {
                // Skip odd numbers
                continue;//while odd numbers are skipped using the continue statement.
            }
            // Print even numbers
            System.out.print(i + " ");
        }

	}

}
