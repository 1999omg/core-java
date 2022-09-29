package com.a;

public class Semister {
	int physics , chem , boi;
	String name ;
public  void enter_marks (int p , int c ,int b ,String na ) {
	
	physics = p;
	chem =c ;
	boi = b;
	name = na ;	
}
public void show_marks() {
	int total = physics +chem+boi  ;
	float per = (int) total*100/300 ;
	System.out.println("physics marks:" + physics);
	System.out.println("chemistry marks:" +chem);
	System.out.println("biology marks :" + boi);
	System.out.println("total marks :" +total);
	System.out.println("percentage :" +per);
	
}
public static void main (String []args) {
	Semister obj= new Semister ();
	obj.enter_marks(70, 80, 90, "ram");
	obj.show_marks();
	

} }
