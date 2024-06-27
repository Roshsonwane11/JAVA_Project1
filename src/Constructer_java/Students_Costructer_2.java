package Constructer_java;

public class Students_Costructer_2 {
  int rollNumber;
  String name;
  float marks;
  final static String schoolName ="Testing Shatra";// We cannot change schoolname, and we use two keywor, static anf final.
//we use static schoolname, beacause memory waste nhi hogi, ek bar hi load hoga.
//Parameterize constructer	 
public 	Students_Costructer_2(int rollNum, String nm, float maks){
	rollNumber  = rollNum;
	name= nm;
	marks = maks;

}
	public static void main(String[] args) {
	  Students_Costructer_2 Roshani = new Students_Costructer_2(1, "Roshani", 80f);
	  Students_Costructer_2 Nil = new Students_Costructer_2(2, "Nil", 90f);
		
      System.out.println(Roshani.rollNumber );//ALWAYS CALL DIFF COPY
      System.out.println(Nil.rollNumber);
      
      System.out.println(Roshani.name );//ALWAYS CALL DIFF COPY
      System.out.println(Nil.name);
      
      System.out.println(Roshani.marks );//ALWAYS CALL DIFF COPY
      System.out.println(Nil.marks);
	}

}
