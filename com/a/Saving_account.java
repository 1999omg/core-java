package com.a;
import java.util.Scanner;
public class Saving_account {
	String name ;
	int ac;
	float balance;
	int customer_id;
	int withrawl ;
public String bank(String name, int cust , int waith,float bal) {
	System.out.println ("string method start");
	this.name=name;
	this.customer_id=cust;
	this.balance=bal;
	return name ;
    }
	
public void  bank(int bank) {	
	System.out.println("int method stars");
	System.out.println("enter withrawl ammount");
	Scanner sc = new Scanner(System.in);
	withrawl = sc.nextInt();
   }
	public void bank() {		
		System.out.println("default mehtod sttart");
		balance=balance-withrawl ;
		System.out.println("final ammount is after withrawl"  + balance);		
	}
	public void show () {
		System.out.println("custemer name "+ name);
		System.out.println("cust id " +customer_id);

	}

}

class Current_account{
	
	String name ;
	int ac;
	float balance;
	int customer_id;
	int withrawl ;
public String bank(String name, int cust , int waith,float bal) {
	System.out.println ("string method start");
	this.name=name;
	this.customer_id=cust;
	this.balance=bal;
	return name ;
    }
	
public void  bank(int bank) {	
	System.out.println("int method stars");
	System.out.println("enter withrawl ammount");
	Scanner sc = new Scanner(System.in);
	withrawl = sc.nextInt();
   }
	public void bank() {		
		System.out.println("default mehtod sttart");
		balance=balance-withrawl ;
		System.out.println("final ammount is after withrawl"  + balance);		
	}
	public void show () {
		System.out.println("custemer name "+ name);
		System.out.println("cust id " +customer_id);

	}

}
	
class Fix_deposite{
	String name ;
	int ac;
	float balance;
	int customer_id;
	int withrawl ;
public String bank(String name, int cust , int waith,float bal) {
	System.out.println ("string method start");
	this.name=name;
	this.customer_id=cust;
	this.balance=bal;
	return name ;
    }
	
public void  bank(int bank) {	
	System.out.println("int method stars");
	System.out.println("enter withrawl ammount");
	Scanner sc = new Scanner(System.in);
	withrawl = sc.nextInt();
   }
	public void bank() {		
		System.out.println("default mehtod sttart");
		balance=balance-withrawl ;
		System.out.println("final ammount is after withrawl"  + balance);		
	}
	public void show () {
		System.out.println("custemer name "+ name);
		System.out.println("cust id " +customer_id);

	}

}




