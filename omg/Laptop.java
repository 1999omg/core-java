package sham;

public class Laptop {
	private String name ;
	private String os;
	private int price ;
	 
	
	public String getName() {
		return name ;
	}

	public void setName(String name) {
		this .name= name ;
	}
	public String getOs() {
		return os ;
	}
	public void  setOs(String captain) {
		this.os= captain;
		
	}
	public int getPrice() {
		return price ;
	}
	public void setPrice (int player) {
		this. price   = player ;
	}
	
	
	public static void main (String []args) {
		Laptop la= new Laptop ();
		la.setName ("dell ");
		la.setOs("i3");
		la.setPrice(30000);
		System.out.println("name of team  " +la.getName());
		System.out.println("name of captain " +la.getOs());
		System.out.println("number of team player" +la.getPrice());
		
		
		Laptop team2 =new Laptop();
		la.setName("hp");
		la.setOs("i5");
		la.setPrice(50000);
		
		System.out.println("name of brand  " +team2.getName());
		System.out.println("name of operating system " +team2.getOs());
		System.out.println("price of laptop " +team2.getPrice());
		
		
	}
} 


