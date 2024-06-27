package Array;

public class Array1 {
	//array with literals
int[] x= {1,2,3,4,4};
	public static void main(String[] args) {
	Array1 arr = new Array1();
	//System.out.println(arr.x[2]);
	//System.out.println(arr.x[7]); //Exception in thread 

	for(int index =0; index<=arr.x.length-1; index++) {
		System.out.println(arr.x[index]);
		
	}
	
	}

}

/*Arry using literals
<datatype> [dimnetion]<ref_variablename> = {elemnet1, elemnt2, elemnt3};
int [] x= {1,3,4,5};
int[] xx={}// zero sizee array 
byte[] b = {1,2,4, 128}//range -128 to 127>> 
char[] ch= {'a','b','c', 97}// 97 will get unicode value 98=a as long as implict type casting happen here

using NEW Keyword
int[] i =new int[0]; its by default zero, -1 is work
int [0] size dena compulsory he otherwise array dimention is missing error aayega
int[] s={'a'}// implicit type cating 97
*/