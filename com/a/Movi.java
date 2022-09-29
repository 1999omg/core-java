package com.a;

public class Movi {
	int year_ofrelese;
	float profit;
	String actor_name;
	String producer_name ;
	
public void accept_details() {
	year_ofrelese = 1999;
	profit = 200;
	actor_name="v.n.disel";
	producer_name= "erfan khan" ;
}
public void show_details() {
	System.out.println("year of relese"+year_ofrelese);
	System.out.println("profit of movi:" +profit);
	System.out.println("actor name of moavi:" + actor_name);
	System.out.println("producer name:"+producer_name);
	
	
	
}
public static void main(String[]arg) {
	  Movi titanic = new Movi();
	    titanic.accept_details();
	
	    titanic.show_details();
	    
	    System.out.println(titanic.profit);
	    
}

}
