package Mentor_ship_Program;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		//Write a Java program to compute the body mass index (BMI).
        //BMI = kg/m2 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        // Convert weight from pounds to kilograms (1 pound = 0.453592 kilograms)
        weight = weight * 0.453592;
        
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        // Convert height from inches to meters (1 inch = 0.0254 meters)
        height= height  * 0.0254;
        //Calculate BMI
        double bmi = weight / (height * height);

        //Display the BMI
        System.out.println("BMI: " + bmi);
    	sc.close();
	} 
	

}
