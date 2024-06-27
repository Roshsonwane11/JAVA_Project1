package Array;

public class Smallest_number {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		
		int SmallNum = 1;
		for(int i=1; i<arr.length-1; i++) {
			
			if(arr[i] < SmallNum)
			SmallNum = arr[i];
		}
		System.out.println(SmallNum + " ");
	}

}
