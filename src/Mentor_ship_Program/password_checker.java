package Mentor_ship_Program;

import java.util.Scanner;

public class password_checker {
          //Create a program using do-while to find password checker until a valid password is entered.
	public static void main(String[] args) {
	  
		Scanner scanner = new Scanner(System.in);
        String validPassword = "Rosh123"; // Valid password
        String inputPassword;

        do {
            System.out.print("Enter password: ");
            inputPassword = scanner.nextLine();

            if (inputPassword.equals(validPassword)) {//string asel tr .equal methos use
                System.out.println("Valid password !!");
                break; // Exit the loop if the password is correct
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } while (true); // Continue looping until a valid password is entered
        scanner.close();
      
    }
	}

	

