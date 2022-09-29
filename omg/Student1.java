package sham;
import java.util.Scanner ;
public class Student1 {

public static int factorialnum (int i, int n) {
	int factorial = 1;
	 
	for ( i=n ; i>n ;i--) {
		 factorial = factorial * i ;
		
	}
	
	System.out.println(factorial);
	return 0;
	
	
		
	}

public static void main (String []args ) {
	
Scanner sc =  new Scanner (System.in );
int n  = sc.nextInt();
int i= n;
  int factorial = factorialnum ( i , n);


}}
	