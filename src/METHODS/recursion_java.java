package METHODS;

public class recursion_java {
//Recursion is the technique of making a function call itself
//print hello 10 times without using any method	
	
	static int count =1;
	public void printHello() {
		//System.out.println("Hello");
		if(count<10) {
			System.out.println("Hello");
			count++;
			printHello();
		}
	}
	public static void main(String[] args) {
		recursion_java obj = new recursion_java();
		obj.printHello();

	}

}
