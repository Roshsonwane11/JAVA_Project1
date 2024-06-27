package METHODS.Return_Type;

public class palindrom_return_type {
	
     public boolean IsPlaindrom(int number) {
    	 int rev=0;
    	 int num = number;
    	 while(number!=0) {
    		 int digit  =number%10;
    		 rev= (rev*10)+digit;
    		 number = number/10;
    	 }	 
    	boolean IsPali = false;
    	if(num== rev) {
    		IsPali= true;
    		
    	}
    	return IsPali;
    	 }
     
	public static void main(String[] args) {
	System.out.println(new palindrom_return_type().IsPlaindrom(121));
	


	}

}
