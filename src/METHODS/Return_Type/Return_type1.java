package METHODS.Return_Type;

public class Return_type1 {
//return type can be anything form the primitive and nonprimitive datatype

	public int m1() {
		
		return 10;//last line of code

	}
	public byte m2() {
		byte x= 10;
		return x;
		

	}
	public static void main(String[] args) {
		Return_type1 obj = new Return_type1();
		obj.m1();
		obj.m2();
	}

}
