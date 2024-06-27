package Type_Casting;

public class implicit_Typecatsting {

	public static void main(String[] args) {
		//Implicit type casting: Converting smaller to biggar datatype
		
		byte b =1;
		int i= b;
		System.out.println(i);

		int ii= 11;
		float f =ii;
		System.out.println(f);
		
		char c = 'a';
		int sd =c;
		System.out.println(sd);
		
		char cc = 90;
		int sdd =cc;
		System.out.println("ans "+ sdd);
        
        
		int i2 = 65;
        char c23= (char)i2;
        System.out.println(c23);
        
        int ccd = 90;
        char sddc =cc;
		System.out.println("ans2 "+ sddc);
        
      
	}

}
