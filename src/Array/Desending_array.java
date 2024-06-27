package Array;


public class Desending_array {

	public static void main(String[] args) {
	  int[] arr = {1,2,9000,0,3,4,5,6,7, 100,0,0};
	  int temp=0;
	  for (int i = 0; i < arr.length; i++) {
		for (int j =i+1; j < arr.length; j++) {
			
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				
			}
		}
		System.out.print(arr[i] + " ");
	}

	}

}
