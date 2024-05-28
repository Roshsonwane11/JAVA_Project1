package Programs;
import java.util.Scanner;


public class else_if_haha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER a Number");
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println("HAHAHAHA");
		}else if(num%3==0) {
			System.out.println("Number is divisible by 3");
		}
		else if(num%5==0) {
	        System.out.println("number is divisible by 5");
		}

	}

}
