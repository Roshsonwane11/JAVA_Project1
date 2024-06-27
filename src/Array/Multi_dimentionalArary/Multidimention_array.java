package Array.Multi_dimentionalArary;


public class Multidimention_array {

	public static void main(String[] args) {
		
		int [][] x= new int[4][4];//	2D arry using new keyword
		
		int[][] arr= {{1,2,3}, {3,4}, {5,6}, {7,8,9} };//array of arrays//2D array
		
		for (int outerIndex = 0; outerIndex<x.length; outerIndex++) {
			for (int innerIndex = 0; innerIndex <x[outerIndex].length; innerIndex++) {
				System.out.print(x[outerIndex][innerIndex]+ ", ");
			}
			System.out.println();
		}
	}

}
