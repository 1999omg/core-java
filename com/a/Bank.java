package com.a;
import java.util.Scanner ;
public class Bank {
	int balance ;
	int deposite ;
	int withdrawl ;
	String nameof_custm;
	
public void inputs_accountdetails () {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter deposite  ammount");
	 deposite =sc.nextInt();
	 System.out.println("enter withrawl ammount");
	 withdrawl =sc.nextInt();
	 System.out.println("enter name of customer");
	 nameof_custm= sc.nextLine();
	
}
public void show_account_details () {
	 balance = deposite - withdrawl ;
	 System.out.println("name : " +nameof_custm );
	 System.out.println("deposite ammount : " + deposite);
	 System.out.println("withdrawl ammount :"+withdrawl); 
	 System.out.println("account balance is:"+ balance);
	
}
 

	
}

