package sham;
import java.util.Scanner ;
public class Practice {

	public static void main (String []args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner (System.in);
		System.out.println("enter length");
		int length =  sc.nextInt();
		System.out.println("enter breadth");
		int breadth  = sc.nextInt();
		int area = length*breadth ;
		int perimetr =   ((length   + breadth)   ) ;
		int p = perimetr*2  ;
			System.out.println("area of reactangle ="  +area); 
			System.out.println("perimeter of reactangle =" +p);
		 }}

	
}
