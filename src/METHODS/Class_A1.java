package METHODS;

public class Class_A1 {

	public static void main(String[] args) {
        Class_A obj = new Class_A();//we can call other obeject
        
        //obj.myPrivateMethod(0); //Private method acessible only in same class.
        obj.myMethod(0, 0);
        //Default method only call in same package not other class
        obj.MyDefaultMethod(0);//defalt method form clas_A
        
        obj.MYProtected(0);//CALL protect method from same package of classA
        
        
	}

}
