package sham;
import java.util.Scanner ;
public class Switchoddeven {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		
		
		switch(num1%2  ){
		case 0:
		    System.out.println(num1+" is an Even number");
		    break;
		case 1:
		    System.out.println(num1+" is an Odd number"); 
		}
		}
		}
