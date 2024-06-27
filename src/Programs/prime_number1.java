package Programs;

import java.util.Scanner;

public class prime_number1 {
//prime number is divisible by 1 and itself
	// 5 = 5%1=0, 5%2=1, 5%3=2, 5%4=1, 5%5=0
	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count =1;
		
		for (int i =2; i <num; i++) {
			if(num%i==0) {
				count++;
			}
			if(count>2) {
				break;
			}
		}
		if(count>2) {
			System.out.println(num+ " Number is not prime");
		}else {
			System.out.println(num+ " Number is prime");
		}


	}

}
