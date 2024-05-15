package Scanner_Class;

import java.util.Scanner;

public class User_input_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in represnt console
		System.out.println("Enter two number");
		
		int  a= sc.nextInt(), b =sc.nextInt();
		
		if (a<b) {
			System.out.println("a is greater than b");
			//System.out.println(x);
		}else {
			System.out.println("b is greater than a");
		}
     
		//Scanner class using String
		System.out.println("Enter a String");
		String s =sc.next(); // word : no space
		String t = sc.nextLine();// sentence with space
		System.out.println(s); // give only my
		System.out.println(t); // gives my name is Roshani
				
	}

}

/*
Scanner class use to take imput from user
import packge :import java.util.Scanner;
Put construture: Scanner sc = new Scanner(System.in); //system.in represnt console
user Input: int  a= sc.nextInt(), b =sc.nextInt();

nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
next string
*/