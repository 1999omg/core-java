package sham;

public class Fd_account {
int acount_no ;
float balance;
String ac_holder_name;
static String Bank_name ;
static int intrst = 6;


public static void intest(int ir) {
	intrst= ir ;
	
}


public Fd_account(int ac ,float ba ,String name) {
	this.acount_no= ac;
	this .balance=ba;
	this.ac_holder_name  =name ;
	

}
public void show_deatails() {
	System.out.println("account number :" + acount_no);
	System.out.println("account balance:" + balance*intrst/100 );
	System.out.println("accont holdar name :" + ac_holder_name );
	}
}
class Saving_account{
	
	 int acount_no ;
	float balance;
	String ac_holder_name;

	public Saving_account(int ac ,float ba ,String name) {
		this.acount_no=ac;
		this.balance =ba;
		this.ac_holder_name  =name ;

}
	public void show_deatails() {
		System.out.println("account number :" + acount_no);
		System.out.println("account balance:" + balance );
		
		System.out.println("accont holdar name :" + ac_holder_name );
	
	}}


class Recuring_account{
	public static final String r = null;
	int acount_no ;
	float balance;
	String ac_holder_name;
	
	public Recuring_account(int ac ,float ba ,String name) {
		this.acount_no=ac;
		this.balance=ba;
		this.ac_holder_name =name ; 
		
	}
	
	
	public void show_deatails() {
		System.out.println("account number :" + acount_no);
		System.out.println("account balance:" + balance );
		System.out.println("account balance:" + balance );
		System.out.println("accont holdar name :" + ac_holder_name );
		
}
	

	public bank


	public static void main(String []args) {
		
		
		Fd_account obj1 = new Fd_account (12345, 10000, "ram");
		obj1.show_deatails();
		
		
		Saving_account obj2=new Saving_account(32145,2000,"sham");
		obj2.show_deatails();
		
		
		Recuring_account obj3 = new Recuring_account(45878,5000,"ganesh");
		obj3.show_deatails();
		
		
		
}









