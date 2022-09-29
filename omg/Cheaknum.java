package sham;
import java.util.Scanner;
public class Cheaknum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		int i ;
		System.out.println("enter num has to cheak");
		int n = sc.nextInt();
		boolean flag = false;
		while (num!= 0) {
			int result = num%10 ;
			if (result == n ) {
				flag=true;
				break;
				
			}
			
			num= num/10 ; }
			
			if (flag==true) {
				
				System.out.println("number present");}
				else 
					System.out.println("enter num");
						
				
				
				
			}
		}
		
		

	


