package com.a;

public class Book2 {
	
	String name ;
	String author ;
	int id ;
	

	public Book2 () {
		name= "bhagwat gita ";
		author = "krishna";
		id = 108;
		
	}
	

  public Book2(String na ,  String aut, int idd) {
	  this .name= na;
	  this.author= aut;
	  this. id=idd ;
	  System.out.println("parent  class");
	  
	  
	  System.out.println("name of book"+name);
	  System.out.println("name of author "+author);
	  System.out.println("book id "+id);
	  
	  
  }
  

}

public class book2 extends Book3 {
	int price;
	String publiction;
	
	
	public Book3()
	{
		price = 1000;
		publication = "g"
		
		
	}
}

