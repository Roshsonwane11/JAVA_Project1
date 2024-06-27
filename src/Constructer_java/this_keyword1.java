package Constructer_java;

public class this_keyword1 {
	int rollNumber;
	String name;
	float marks;
	final static String schoolName = "Testing Shatra";

	public this_keyword1(int rollNumber, String name, float marks) {//Parameterize constructer
		this.rollNumber = rollNumber; //this keyword use to represent current class instance/ object
		this.name = name;
		this.marks = marks;

	}

	public static void main(String[] args) {
		Students_Costructer_2 Roshani = new Students_Costructer_2(1, "Roshani", 80f);
		Students_Costructer_2 Nil = new Students_Costructer_2(2, "Nil", 90f);

		System.out.println(Roshani.rollNumber);// ALWAYS CALL DIFF COPY
		System.out.println(Nil.rollNumber);

		System.out.println(Roshani.name);// ALWAYS CALL DIFF COPY
		System.out.println(Nil.name);

		System.out.println(Roshani.marks);// ALWAYS CALL DIFF COPY
		System.out.println(Nil.marks);
	}

}
