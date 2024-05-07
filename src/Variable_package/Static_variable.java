package Variable_package;

public class Static_variable {
  static int x =45;
	public static void main(String[] args) {
	Static_variable	 f1 = new Static_variable();
	Static_variable	 f2 = new Static_variable();
	
	x = f1.x +5; //50 then all object copy value will 50. change will aapere on all.

    x = f2.x+10;//60


	System.out.println(f1.x); //it create single memory.
	System.out.println(f2.x);  
	
	}

}
/*
//copy static variable remain same for every object
//any object can acces static variable

*/