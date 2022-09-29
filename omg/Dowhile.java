package sham;
import java.util.Scanner ;
public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		
		int count = 0 ;
				int i = 2;
		while (i<=n/2) {
			
			if(n%i==0) {
				count++;
				break;
			}
			i++;
			if (count ==0) { 
				System.out.println( n+ "is prime");}
				else 
					System.out.println(n+"is not prime");  
			
			
			
			
			
			
			
			
			
			
					
			}
		}
			
		
		
		
		 }
	
	
	

		
		          
		          
			
			
		
		
			
		
		


