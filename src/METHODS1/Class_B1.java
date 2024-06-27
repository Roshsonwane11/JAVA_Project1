package METHODS1;

import METHODS.Class_A;

public class Class_B1 extends Class_A{ //CHILD CLASS

	public static void main(String[] args) {
        Class_A obj = new Class_A();//we can call other obeject
		
		obj.myMethod(0, 0);
        
		obj.myMethod(0, 0);
		//private 
		
		//obj.myPrivateMethod(0); //myPrivateMethod are from  class_A and is private so we cannot called
		//Private member can be access inside a class only.
				
		Class_B1 obj1 =new Class_B1();
		obj1.MYProtected(0);
	    //obj.myPrivateMethod(0);
	}

}
