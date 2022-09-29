package sham;

public class Account {
	String name ;
  float ac_balance ;
int ac_no;
static int intrest ;


    Account(){
    	   
    	ac_balance = 50000;
    	ac_no = 12456 ;
    	name = "ram";
    	
    }


    Account (float b , int ac, String nam){
    	this .ac_balance=b ;
    	this.ac_no = ac ;
    	this.name=nam;
    
    }
    public static void intrest(int ir) {
    	
    	intrest=ir ;
    	System.out.println("intrest incuude ammount" + intrest);
    	
    }
   public void show_deatils() {
	   
	   System.out.println("account balance"+ ac_balance);
	   System.out.println("account holder name" + name);
	   System.out.println("account number" + ac_no);
	   System.out.println("ammount after intrest" + intrest );
	   
	   
   }
    
}
 class Saving_acc{
	 public static void main(String[]args) {
		 
		 Account obj =  new Account();
		obj.show_deatils();
		 
	 }
 }