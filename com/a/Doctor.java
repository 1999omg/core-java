package com.a;

public class Doctor {
	
	private int hId;
	private int regNum;
	private String name ;
	
	
	Doctor(int id , int reg ,String nam){
		hId= id;
		name= nam;
		regNum=reg ;
		
		
	}
	public void setHId(int a) {
		hId=a ;
	}
public void setRegNum(int n) {
	regNum=n ;
}


public String toString () {
	return
			
	"doctor name is "+name+"and his registration id is "+regNum+"and his hospital id id"+hId ;

	
	
	
}

public void setName(String na) {
	// TODO Auto-generated method stub
	name=na ;
}

}



