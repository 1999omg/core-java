package com.a;
import java.util.Scanner; 
public class Eployee {
	
	String name ;
	int age ;
	 int sallery ;
	 
 void show_details() {
	 System.out.println ("employee name "+name);
	 System.out.println ("employee name "+ age);
	 System.out.println ("employee name "+ sallery);
	
} void accept_details(int a,int s , String n) {
	age = a;
	sallery= s;
	name = n;
			
}
void show_high_sallery() {
	if ((e1.sallary> e2.sallery)) {
		System.out.println( "is high" +e1.name);
	}else 
		System.out.println(name+ "is high" +e2.name);
}
public static void main(String[]args) {
	Eployee e1 = new Eployee ();
	e1.accept_details(30, 30000, "ram");
	e1.show_details();
	Eployee e2= new Eployee ();
	e2.show_details();
	e2.accept_details(032, 35000, "sham");
}
} 
