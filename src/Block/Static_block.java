package Block;

public class Static_block {
	
	static{
		 System.out. println("im Static block");
	}
	
	public static void main(String[] args) {
		//Static_block ref = new Static_block();
		System.out.println("Im main method");
	
	}
}

/*
Statit Block: written at the class level using static keyword
 its load in memory at the time class is load
 static load 1st before main method


*/