package com.a;
import java.util.Scanner; 
public class Employee {
	
	String name ;
	int age ;
	 int sallery ;
	 
	 
	 void accountOpen(Object accept_details) {
		 accountOpen(accept_details);
		 
	 }
	 
	 
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
	if (e1.sallery> e2.sallery) {
		System.out.println(name+ "is high" +name);
	}else  
		System.out.println(name+ "is high" +name);
}
public static void main(String[]args) {
	Employee e1= new Employee ();
	e1.accept_details(30, 30000, "ram");
	e1.show_details();
	Employee e2= new Employee ();
	e2.show_details();
	e2.accept_details(032, 35000, "sham");
	
	 System.out.println ("show sallery" + e1.sallery);program 
}
} 
