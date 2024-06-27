package control_statemnet;
import java.util.Scanner;
public class Demo2 {

	public static void main (String [] args) {
		
	 Scanner sc = new Scanner (System.in);
	 int[] arr= new int [5];
	 System.out.println("Enter 5 Elements");
	 
	 for(int index =0; index<4; index++) {
		 arr[index]= sc.nextInt();
	 }
	 int  max = arr[0];
	 for(int index = 0; index<4; index++) {
		 System.out.print(arr[index]+",");
		
		 if(arr[index] > max)  
             max = arr[index];  
      }  
	 System.out.println();
	 System.out.println("Max Number from elements =" + max);
	 sc.close();
	 }
	
	 
	 
		
	 
	 
			
		
				
		
	}



