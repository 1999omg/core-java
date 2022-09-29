package com.a;

public class Constructor {
	
	int value1;
	int value2;
	int value3;
	
	
	public Constructor() {
		
		System.out.println("defualt constructor value");
		value1=50;
		value2=100;
		value3=150;
		
	}

	public Constructor(int val1,int val2,int val3) {
		System.out.println("parameter constructor value");
		this.value1=val1;
		this.value2=val2;
		this.value3=val3;
		
	}
	public void show() {
		System.out.println("value1"+value1);
		System.out.println("value2"+value2);
		System.out.println("value3"+value3);
	}
	
	public static void main(String[]args) {
		Constructor obj=new Constructor(100,200,300);
		obj.show();
	}
	
}

class Constructor1{
	public static void main(String[]args) {
		
		Constructor obj=new Constructor();
		obj.show();
	}
}


