package sham;
import java.util.Scanner; ;
public class Hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("HOTEL MENU") ;
		System.out.println("for pav bhaji plese press 1 - 100rs");
		System.out.println("for palak paneer plase press 2 - 120rs");
		System.out.println("for puri bhaji plase press 3 - 120rs");
		
		System.out.println("enter quantity");
		int q = sc.nextInt() ;
		 int p = sc.nextInt();
		 switch  (p) {
		 case 1 : System.out.println("you orded pav bhaji=" + q*100);
		          break;
		 case 2 : System.out.println("you orded palak panner=" + q*120);
		      break;
		 case 3 : System.out.println("you orded puri bhaji=" + q*120);
		  
		  System.out.println(" thank you welcome again" );
		 
		 }
		
		// TODO Auto-generated method stub

	}

}
