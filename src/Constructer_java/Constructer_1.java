package Constructer_java;


public class Constructer_1 {
 int i;//intialize ke dega constructer

 //no arguments constructer
 public Constructer_1(){
	 System.out.println("No arguments Constructer");
 }
 
	public static void main(String[] args) {
	
	System.out.println(new Constructer_1().i);//calling constructer
		//constructer same as class name, and it initialize instace variable of class
        //i did not written constructe but Java compiler written at compile time.default
		
		
		Constructer_1 t= new Constructer_1();//jitne time object banega utne time constructer call hoga.
	}

}
