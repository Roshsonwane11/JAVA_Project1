package Mentor_ship_Program;
import java.util.Scanner;
public class isFinite_program {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter a number");
    	 
    	 double  doubleValue = sc.nextDouble();
    	 
    	 if (Double.isFinite(doubleValue)) {
    		 
             System.out.println(doubleValue + " is a finite double value.");
         } else {
             System.out.println(doubleValue + " is not a finite double value.");
         }
    	 sc.close();
     }
}
