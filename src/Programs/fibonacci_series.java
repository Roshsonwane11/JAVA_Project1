package Programs;

public class fibonacci_series {

	public static void main(String[] args) {
		
		int i = 1, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till ");

	    while (i <= 10) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;  // nextterm = 0+1
	      firstTerm = secondTerm; //0 =1
	      secondTerm = nextTerm; // 1

	      i++;
	    }
		
	}

}
