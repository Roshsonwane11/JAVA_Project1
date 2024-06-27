package METHODS;

public class Class_A {
   //private method
	private void myPrivateMethod(int x) {// private method call only inside class.

		System.out.println("My myPrivateMethod class_A");
	}
//public method
	public void myMethod(int x, int y) {// instance method
		System.out.println("My method class_A");
	}
   
	
	//default
	void MyDefaultMethod(int c) {
		System.out.println("My MyDefaultMethod");
	}
	
	//Protected Method, I have make other methods1 of Class_B1 child
	protected void MYProtected(int i) {
		System.out.println("My ProtectedMrethod");
	}
	public static void main(String[] args) {
		Class_A obj = new Class_A();// instance method ke liye object lagega

		obj.myMethod(0, 0);// you can call method multiple time.

		obj.myPrivateMethod(0);
		
		obj.MyDefaultMethod(0);//protected method
	}

}
