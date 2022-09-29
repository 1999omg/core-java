package com.a;

public class Team {
	private String name ;
	 private String coatch ;
	private String achive ;
	 private int size ;
	

 public Team() {
	  name  = "india cricket";
		 coatch = "ravi shashti";
		 achive  = "t-20 world cup achiver" ;
		 size = 11 ;
		
	
}public void show_deatils() {
	System.out.println("name of team "+ name);
	System.out.println("name of coatch" +coatch);
	System.out.println("achivments of the team") ;
	
}
 
 
 
 public static void main ( String []args) {
	 Team obj= new Team ();
	 obj.show_deatils();
	 
 }
}