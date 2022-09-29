package sham;
import java.util.Scanner ;
public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int add=0;
	
		 while (n>0) {
			 int power  = n%10 ;
			int  num = power ^3 ;
			n = n/10 ;
			add+=power ;
			 
		 }   
		 if (add  == n ) {
			 System.out.println( n+"is armstrong");}
		 else  
			 System.out.println( n+"is not armstrong");
			 
		 }
		 
		 
		 
		 
		 

	}


