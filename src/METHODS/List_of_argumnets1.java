package METHODS;

public class List_of_argumnets1 {
	
public void add(int x, byte b, String s) {
	System.out.println(x);
	System.out.println(b);
	System.out.println(s);
}
	public static  void main(String[] args) {
		//new  List_of_argumnets1().add(0, 0, null);
		// list of argument mention krna pdega. no type casting with list o arguments
		//all list of arguments are local variable

		new List_of_argumnets1().add(648, (byte)10, "roshani");
	}

}
