package METHODS;

public class method1 {
	
public void m1(int x, int y) {
	System.out.println("M1 method");
}
	
	public static void main(String[] args) {
		method1 mtd = new method1();
		mtd.m1(0, 0); //called method object.method_name
		mtd.m1(0, 0); 
		mtd.m1(0, 0); 
	}

}
/*
Method can be invoked(call) multiple time.  E.g. Recipe we can make multiple time
<acess_modifier> <return_type> <method_name>(<list_of_arg){
    //body
}





*/