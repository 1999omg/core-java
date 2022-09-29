package sham;
import java.util.Scanner ;
public class Loop {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner(System.in);
		          
				int max = 5>3 ? 5 : 3 ;
				System.out.print(max);
				
				
				
				
				int x = sc.nextInt();
                int y = sc.nextInt();
							 
				String max2 =  (x%y ==0)?  x+ " is divisible by "+y :  x+ " is not divisible by " +y   ;
				          System.out.println(max2) ; 
				          
				          
				          
				             int a=sc.nextInt();
				             int b=sc.nextInt() ;
				             int c = sc.nextInt();
				             
 String mes = a>b &&a>c ?  a+ "is great" : b>c && b>a ? b+ "is grat" : c+ "is great " ; 
    System.out.println(mes);
    
    System.out.println("enter your number of cloths");
    int num1 = sc.nextInt();
    System.out.println("enter price price per cloth");
    int num2 = sc.nextInt();
    int p = num1 * num2 ;
    System.out.println( "your ammount before discount" );
    String shop = p> 10000 ? "congrats you got 10% discont " 
    		:  "contrats you got 5% discont "   ;
    System.out.println(shop) ;
    
    if (p>10000) {
    	float price= (p*10)/100 ;
    	float dis = p- price ;
    	System.out.println( dis);
  
    } else {
    	float price = (p*10) /100 ;
    	float dis = p - price ;
    	System.out.println(dis ) ;
    }
    
				
	}

}
