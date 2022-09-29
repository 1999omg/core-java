package com.a;

public class Drdo_appication2 {
	private String name ;
	private String  School_name;
	 int ssc_marks ;
	 
	
	public String getName() {
		return name ;
	}

	public void setName(String name) {
		this .name= name ;
	}
	public String getSchool_name() {
		return  School_name;
	}
	public void  setSchool_name(String sc_name) {
		this.School_name= sc_name;
		
	}
	public int setSsc_marks() {
		return ssc_marks ;
	}
	public void getSsc_marks (int markss) {
		this. ssc_marks   = markss ;
	}
	
	public String toString () {
		return 
		"name of studet is "+name+"and sachool name of candidate is"+School_name+"and his ssc marks is"+ssc_marks;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drdo_appication2 la= new Drdo_appication2 ();
		la.setName ("om gawade ");
		la.setSchool_name("chatrapati shivaji high achool");
		la.getSsc_marks(50);
		


		
		
	}

}





