package com.a;

public class Account {
private int acBalance ;
private int balance ;
String name ;



  void   access_account(int a, int ba ,String  nam) {
	 acBalance = a;
	 balance = ba ;
	 name = nam ;
	 
 }
 public void show_details () {
	 System.out.println("accooounnt balamce "+ balance);
	 System.out.println("saving balance " + acBalance );
	 System.out.println("account hoder name " +name  );

 }
 
 public static void main(String[]args) {
	Account obj = new Account ();
	obj.access_account(5000, 40000, "ram rav");
	obj.show_details();
 }
 
}
