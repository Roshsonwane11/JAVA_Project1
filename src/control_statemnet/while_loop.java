package control_statemnet;

public class while_loop {
   public static void main (String [] args) {
	   
	   int i =1; //start point
		while (i<=10) { //end point
			
			System.out.println("hello_" + i);
			i = i +1; //increment //i++ nhi likha to infinite loop me jayega
			
		}
		System.out.println(i);//11 value will be 11 bcz last me i ki value 11 hui 10<=10 hoke i++

   }
}
