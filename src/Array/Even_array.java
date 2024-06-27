package Array;

public class Even_array {
	static int[] x= {24,2,3,6,4};
	public static void main(String[] args) {
		
		for(int index =0; index<=x.length-1; index++) {
			if(x[index]%2==0) {
				System.out.println(x[index]);//even number from elements
			}
			
			
		}

	}

}
