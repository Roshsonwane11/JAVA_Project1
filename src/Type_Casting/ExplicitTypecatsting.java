package Type_Casting;

public class ExplicitTypecatsting {

	public static void main(String[] args) {
		
		//Explicit Type Casting: converting biggar to smaller datatype, in thid data loss
		int a = 128;
		byte c =(byte)a;
		System.out.println(c);
		
		//Explicit Type Casting
	    int  bb = 40; 	
		byte cc = (byte)bb;
		System.out.println(cc);
		
		int i =10;
		byte b;
		b =(byte)i;
		System.out.println(b);
		
	    float ff= 11.0f;
		int ii =(int)ff;
		System.out.println(ii);
		
		double d = 101.00;
		long l =(long)d;
		System.out.println(l);
		
		int k=65;
		char p= (char)k;
		System.out.println(p);
		
		char jj= 2309;
		System.out.println(jj);
		
		byte m;
		byte n =5;
		m =(byte)(n+5);//10
		System.out.println(b);
		
		
		
		
	}

}
