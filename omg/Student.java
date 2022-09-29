package sham;

public class Student {
	int   physics ;  int math; int  marathi ;  
	   void classroom() {
		
		// TODO Auto-generated method stub
		int physics = 0;
		int math= 0 ;
				
		int marathi=0 ;
		
		 System.out.println ( "physica mark : " +physics );
		 System.out.println ( "math mark : " + math );
		 System.out.println ( "marathi mark : " +marathi );
		 
		
		
		

	}

 public   void studentinfo (int p , int mat , int mart) {
	 
	 
	 physics = p ;
	 math = mat;
	 marathi  = mart ;
 }}
 class Data {
public static void main (String [] args){
	Student sc = new Student ();
	                  
	 sc.studentinfo( 80,75,90 );
	
}}
	
	


