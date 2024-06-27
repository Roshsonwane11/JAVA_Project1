package Array;

public class Array_print_values {

	public static void main(String[] args) {
		
		int[] index= {11,22,33,44};
		System.out.println(index[0]);
		System.out.println(index[1]);
		System.out.println(index[2]);
		System.out.println(index[3]);
		//System.out.println(index[4]);//Index 4 out of bounds for length 4
		
		//using while loop
		int[] elements= {1,2,3,4};
		int i=0;
		while(i<elements.length) {
			System.out.print(elements[i]+" ");
			i++;
		}
		
		//using for loop
		int[] array = {1,6,78,9,1,2};
		for(int t=0; t<=array.length-1; t++) {
			System.out.print(array[t]+ " ");
		}
		
	}

}
