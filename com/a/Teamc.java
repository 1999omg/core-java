package com.a;

public class Teamc {
         String coatch;
         String name ;
         int size ;
         String capt ;
         
         
         Teamc(String na ,String cot , int siz) {
        	 this("team india" , " ravi shastri" , 11) ;
        	 this.coatch= cot ;
        	 this.name= na;
        	 this. size = siz ;
        	 
         }
         public Teamc (String na , String coat, int size) {
        	 this. name = na ;
        	 this.coatch= coat ;
        	 this . size= size ;
        	 
         }
         public void show_details() {
        	 System.out.println("name of team" + name );
        	 System.out.println("name of coatch " +coatch );
        	 System.out.println("size of team " +size ) ; 
         }
	
}
