package sham;
import java.util.Scanner ;
public class ProceduralApproch {

	public  void areaReactangle() {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter lengt");
         int a= sc.nextInt();
         System.out.println(" enter breath of rectangle ");
         int b = sc.nextInt();
         
         int c= a*b;
	 System.out.println("area of rectange = " +c );
	}
		
	public static void main(String[] args) {
		System.out.println("main start");
		ProceduralApproch o = new ProceduralApproch ();
		o.areaReactangle ();
		o.areaReactangle ();
	}
		
	}


