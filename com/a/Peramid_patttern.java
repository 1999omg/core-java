package com.a;
import java.util.Scanner;
public class Peramid_patttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		 
		        int i, j;
		 
		        for(i=0; i<n; i++)
		        {
		 
		            for(j=0; j<=i; j++)
		            {
		                System.out.print("* ");
		            }
		 
		            System.out.println();
		        }
		  
		        for (int i1=0; i1<n; i1++)
		        {
		 
		            for (int j1=n-i1; j1>1; j1--)
		            {
		                System.out.print(" ");
		            }
		  
		            for (int j1=0; j1<=i1; j1++ )
		            {
		                System.out.print("* ");
		            }
		  
		            System.out.println();
		        }
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
		 

	}


