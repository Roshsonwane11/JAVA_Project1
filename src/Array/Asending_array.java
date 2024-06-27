package Array;

public class Asending_array {

	public static void main(String[] args) {
		//increase order: 1, 2, 3, 4, 5, 6,,7,8 
		
		int[] arr= {5,4,3,2,1};
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j =i+1; j <arr.length; j++) {
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i] + " ");
			
		}
		
		//5,4,3, 2,1 1st sort in asending order
		//max =5  =length-1
		//sec_mx= 4  leght -2
		//sec_3rd = 3 length-3
		System.out.println("second largest " + arr[arr.length-3]);
		
		System.out.println("second smallest Num: "+ arr[1]);

	}

}
