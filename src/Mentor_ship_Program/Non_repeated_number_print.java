package Mentor_ship_Program;


public class Non_repeated_number_print {
     
	public static void main(String[] args) {
		
	int[]	a= {1,2,3,4,5,1,2};
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					continue;
				}
				if(a[i]==a[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(a[i]+" ");
				
			}
			
			
		}	
	
	}

}
