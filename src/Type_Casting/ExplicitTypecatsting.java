package Type_Casting;

public class ExplicitTypecatsting {

	public static void main(String[] args) {
		
		//Explicit Type Casting: converting biggar to smaller datatype, in thid data loss
		int a = 128;
		byte c =(byte)a;
		System.out.println(c);//-128 data loss here circular motion me 
		
		//Explicit Type Casting
	    int  bb = 40; 	
		byte cc = (byte)bb;
		System.out.println(cc);
		
		int i =10;
		byte b;
		b =(byte)i;
		System.out.println(b);// int is small and byte is big
		
	    float ff= 11.0f;
		int ii =(int)ff;
		System.out.println(ii);
		
		double d = 101.00;
		long l =(long)d;
		System.out.println("double" +l);
		
		int k=65;
		char p= (char)k;
		System.out.println(p);
		
		
		byte m;
		byte n =5;
		m =(byte)(n+5);//10
		System.out.println( "m " + m);
		
		short mm;
		short nn =5;
		mm =(byte)(nn+5);//10
		System.out.println( "mm " + m);
		
		
		float pp = 10.4f;
		int f = (int)pp;
		System.out.println(pp);
		
		long  kf = 17783398332l;
		
		//convert Unicode aplhabhet value to numeric
		char c1 ='A';
		int i1 = c1;// type casting
        System.out.println(i);//its give unicode value
		
        //convert Unicode numeric value to alphabhet 
        int i2 = 65;
        char c23= (char)i2;
        System.out.println(i2);
		
        //its give unicode value
        char jj= 2309;
		System.out.println(jj);
		
		
	}

}
