package Mentor_ship_Program;
import java.util.Scanner;
public class leap_Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year: ");
        int year = sc.nextInt();
        // Leap year condition: 
        // 1. If the year is divisible by 4 and not divisible by 100, or
        // 2. If the year is divisible by 400.
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        	System.out.println(year + " :is a leap year");
        }else {
        	System.out.println(year + " :is NOT a leap year");
        }
    	sc.close();
	}

}

//&& both true then true
//|| one true then true