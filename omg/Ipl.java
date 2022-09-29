package sham;

public class Ipl {
	private String name ;
	private String captain;
	private int player;
	private String coatch ;
	
	public String getName() {
		return name ;
	}

	public void setName(String name) {
		this .name= name ;
	}
	public String getCaptain () {
		return captain ;
	}
	public void  setCaptain(String captain) {
		this.captain= captain;
		
	}
	public int getPlayer() {
		return player ;
	}
	public void setPlayer (int player) {
		this. player = player ;
	}
	public String getCoatch () {
		return coatch ;
	}
	public static void main (String []args) {
		Ipl team1= new Ipl ();
		team1.setName ("chennai ");
		team1.setCaptain("ms dhoni");
		team1.setPlayer(11);
		System.out.println("name of team  " +team1.getName());
		System.out.println("name of captain " +team1.getCaptain());
		System.out.println("number of team player" +team1.getPlayer());
		
		
		Ipl team2 =new Ipl();
		team2.setName("mubmai");
		team2.setCaptain("rohit sharma");
		team2.setPlayer(11);
		
		System.out.println("name of team  " +team2.getName());
		System.out.println("name of captain " +team2.getCaptain());
		System.out.println("number of team player" +team2.getPlayer());
		
		
	}
} 


