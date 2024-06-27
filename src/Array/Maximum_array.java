package Array;

import java.util.Scanner;

public class Maximum_array {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner (System.in);
		 int[] arr= new int [5];
		 System.out.println("Enter 5 Elements");
		 
		 for(int index =0; index<=4; index++) {
			 arr[index]= sc.nextInt();
		 }
		 int  max = 0;// take one variable
		 
		 for(int index = 0; index<=4; index++) {
			 System.out.print(arr[index]+",");
			
			 if(arr[index] > max) { //arar index ke sath compare karege

                   max = arr[index];
			 }
			 sc.close();
	      }  
		 System.out.println();
		 System.out.println("Max Number from elements =" + max);
		 }
	
	 
	}

