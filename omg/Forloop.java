package sham;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter muber");
		Scanner sc = new Scanner (System.in );
		int table ;		
     int sum = sc.nextInt();
     for ( int i=1; i<=10 ; i = i+1) {
	   table= sum*i ;
	   System.out.println(table);
	   
            }
         
	}

}
