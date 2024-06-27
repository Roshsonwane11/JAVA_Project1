package Patterns_ForLOOP;

public class pattern_10 {

	public static void main(String[] args) {
		
		for(int line=1; line<=4; line++){
			
			for(int ast=1; ast<=4; ast++){
				
				if((line==2 && ast==2)||(line==2 && ast==3) ||(line==3 && ast==2) || (line==3 && ast==3) )
				{
					for(int space=2; space>=1; space--){
						System.out.print(" ");
					}
				}
				else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}

	}

}
