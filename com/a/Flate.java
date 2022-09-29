package com.a;

public class Flate {
	
	int  flatNo;
	String ownerName;
	String area;

	public Flate(int i, String nam, String ar) {
		// TODO Auto-generated constructor stub
		this.flatNo=i;
		this.ownerName=nam;
		this.area=ar;
		
	}

	

	public String toString()
	{
		return"nThe flat no is "+ flatNo+"nThe owner   Name is:-"+ownerName+"nThe area:-"+area;

	}

	public static void main(String[]args) {
		
		Flate f= new Flate(5000, "akshara appartment", "akshardham colony ");
		System.out.print(f);
		
	}

	}
