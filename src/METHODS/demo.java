package METHODS;

public class demo {
	
public void printName(){
	System.out.println("roshani");
}

public int printSurname(){
	System.out.println("sonawane");
	return 10;
}
	public static void main(String[] args) {
		demo obj = new demo();
		obj.printSurname();
		int a= obj.printSurname();
		

}
}
