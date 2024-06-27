package Array;

public class even_numer_array {

	public static void main(String[] args) {
		
		int[] index= {11,22,33,55,77,88,67,31,3,7,5};
		//print all even number
		for(int i =0; i<=index.length-1; i++) {
			if(index[i]%2==0) {
				System.out.print(index[i]+ " ");
			}
		}
		System.out.println();
		//odd number
		int[] array2 = {11,22,33,55,77,88,67,31,3,7,5};
		
		for(int ii =0; ii<=array2.length-1; ii++){
			if(array2[ii]%2!=0) {
				System.out.print(array2[ii] + " ");
			}
		}

	}

}
