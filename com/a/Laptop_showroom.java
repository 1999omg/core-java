package com.a;

public class Laptop_showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop la= new Laptop ();
		la.setName ("dell ");
		la.setOs("i3");
		la.setPrice(30000);
		System.out.println("name of brand  " +la.getName());
		System.out.println("name of operating system " +la.getOs());
		System.out.println("number of team price" +la.getPrice());
		System.out.println("____________________________________________________________________");
		
		
		Laptop la2 =new Laptop();
		la2.setName("hp");
		la2.setOs("i5");
		la2.setPrice(50000);
		
		System.out.println("name of brand  " +la2.getName());
		System.out.println("name of operating system " +la2.getOs());
		System.out.println("price of laptop " +la2.getPrice());
		
	}

}
