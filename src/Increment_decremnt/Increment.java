package Increment_decremnt;

public class Increment {

	public static void main(String[] args) {
		int i =5, j =6;
		
		//int r = (i++) + j; //11; i =5, j =6, bcz incre nhi hoga
		int r = (i++) + j + i; //5 +6 + 6// 17
		int rr = (i++) + j + i; //5 +6 + 6// 17
		System.out.println("adition: " +r);
	
			
		}

	}



/*
  i++ //post increment, main opertion perfporm hone ke badd incre
  ++i; // pre increment  increment kro badme opertion perform.
  i+=1;
 * 
 * 
 */
