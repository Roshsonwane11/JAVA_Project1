package Constructer_java;


public class this_keyword2 {
	
String myName= "roshani";//intsmce variable

static int i =10;//static variable

public void m1() { //instace mwthod
	System.out.println(myName);
m2();
}

public static void m2() {
	this_keyword2 obj = new this_keyword2();	
	obj.m2();
}

	public static void main(String[] args) {
		
		//System.out.println(new this_keyword2().myName);
		System.out.println(i);
		new this_keyword2().m1();
	}

}
