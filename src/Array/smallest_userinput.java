package Array;

import java.util.Scanner;

public class smallest_userinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your String");
        
		int[] arr = new int[5];
		//for index value
		for(int index=0; index<=arr.length-1; index++) {
			 arr[index]= sc.nextInt();
		}
		//for index value and print smallest value
		 int  SmallNum =0;
		 for(int index = 0; index<=arr.length-1; index++) {
			 System.out.print(arr[index]+",");
			
			 if(arr[index] < SmallNum)  
				 SmallNum = arr[index];  
	      }  
		 System.out.println();
		 System.out.println("Max Number from elements =" + SmallNum);
		 sc.close();
		
	}

}
