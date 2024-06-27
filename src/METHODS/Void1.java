package METHODS;

public class Void1 {
	
	 void v1() {
	        System.out.println("Hello, v1");
	    }
	 
	public byte m1() {
		
		 return 10;
	 }
	
	public static void main(String[] args) {
	
		Void1 obj = new Void1();
		obj.v1();//no need to return keyword 
		obj.m1();//Can be anything from primitive or no-primitive data type for return data.
		
		

	}

}
