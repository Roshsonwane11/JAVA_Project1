package control_statemnet;

public class demo {

	public static void main(String[] args) {
//missing series 
	int[] arr= {1,5,9,11,15};
	
	for(int num =1; num<=15;num++) {
		for(int index =0; index<arr.length; index++) {
			
			if(num != arr[index]) {
				System.out.print(num+ " ");
			}
	
		}
	}
	

	}
}
