package Array;

public class Largest_numberfromArray {

	public static void main(String[] args) {
		int[] arr = {1,2,77,88,99};
		
		int largNum=0;
		for(int i=0; i<=arr.length-1; i++) {
		 if( arr[i]  > largNum) 
			 largNum = arr[i];		
		}
		System.out.println(largNum);

	}

}
