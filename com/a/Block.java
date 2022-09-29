package com.a;

public class Block {
	
	static String name ;
	static  int ac ;
	static float balance ;
	static byte id ;
	String bank_name ;
	
;	static 
	{
		name= "krishna " ;
		ac =123456  ;
		balance = 50000;
		id = 53;
	}
	{
		
		  bank_name= "maharashtra gramin bank" ;
		 System.out.println(bank_name);
		 		
	}
	
	public static void main (String[]args) {
		System.out.println(ac);
		System.out.println(name);
		
		Block obj = new Block ();
		
		
		System.out.println("main method") ;
		System.out.println(obj.bank_name);
		
		
				
	}}
	
class Block1{
	public void  show (char[] bank_name) {
		Block obj2= new Block ();
		System.out.println(Block.ac);
		System.out.println("show method ");
		System.out.println(obj2.bank_name);
		
	}
	
	
}

