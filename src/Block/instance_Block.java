package Block;

public class instance_Block {

	{
	 System.out. println("im instance block");
	}
	public static void main(String[] args) {
		instance_Block ref = new instance_Block();
		instance_Block ref2 = new instance_Block();
	}
}

/*Block is group of statement
Instance Block: written at the class level, 
its load when object create, 
multiple time execute as per object


*/