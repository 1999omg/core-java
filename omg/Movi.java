package sham;

public class Movi {
	private int relese , profit,coast ;
	private String nameof_actor, nameof_producer ;
	
	public Movi() {
		relese= 1999;
		profit = 200;
		coast = 100;
		nameof_actor = "salma";
		nameof_producer= "karan";
	}	
	
	public void accept_details (int r ,int p ,int c, String actor, String producer ) {
		r = relese ;
		p= profit ;
		c= coast ;
		actor= nameof_actor ;
		producer = nameof_producer ;
		
		
	}
	
	public void showdetails() {
		System.out.println("actor name:" +nameof_actor);
		System.out.println("name of producer:" + nameof_producer);
		System.out.println("profit :" +profit ) ;
		System.out.println("coast:" + coast);
		System.out.println("release:" +relese);
		
		
		
	}

public static void main(String[] args) {
	
	Movi uri=new Movi ();
	uri.accept_details(100, 200, 1999, "saman khan", "udit");
	uri.showdetails();
	
	Movi dangal = new Movi();
	dangal.accept_details(2018, 300, 400, "amir", "fogat");
	dangal.showdetails();
	dangal.showdetails();
	
}}
