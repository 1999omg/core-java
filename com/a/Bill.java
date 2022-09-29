package com.a;

public class Bill {
	int bill_date ;
	private int bill_ammount;
	private int serial_no;
	private String cust_name ;
	
	
	Bill(){
		
	}
	Bill(int bill,int ser,String  name){
		cust_name=name ;
		serial_no=ser;
		cust_name=name ;
		
		
	}
	
	
	public void setBill_ammount( int bill) {
		this.bill_ammount = bill;
	
	
	}
	public void setSerial_no(int ser) {
		this.serial_no = ser;
	}
	
	public void setCust_name(String name) {
		this.cust_name =name  ;
		
	public String toString() {
		return
				
			"bill ammount is "+bill_ammount ;	
				
	}
	



	
	public static void main (String []args) {
		Bill b= new Bill ();
		b.setBill_ammount(4000);
		
		
	}
	
}
 

 


		
