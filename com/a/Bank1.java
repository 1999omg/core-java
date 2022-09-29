package com.a;
class Bank1{
	
	int a ;
	int b;
	public Bank1(int i, int j) {
		a= i;
		b=j ;
	}
	
	public void show () {
		System.out.println(a+b);
	}
	
	public static void main(String[]args) {
		Bank1 obj= new Bank1(50,100);
		obj.show();
		
		
	}
	
	
}
	
	
