package Mentor_ship_Program;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		float TempFahrenherit= sc.nextFloat();
				
		float Celsius = (TempFahrenherit-32)*5/9;
		// °C = (°F - 32) × 5/9,
		
		System.out.println("Temperature from Fahrenheit to Celsius degrees: " +Celsius);
		sc.close();
	}

}
