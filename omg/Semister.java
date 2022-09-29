package sham;

public class Semister {
float physics ;
float chemistry;
float math ;
float total;
float percentage ;

 public  void  entermsrk(float p , float c , float m ,  float t, float per ) {
	physics =p ;
	c= chemistry ;
	m  = math ;
	t= m+p+c;
	per = t*100/3000 ;
}
public void  show( ) {
	float t =  physics+ chemistry+ math ;
	float per = t*100/300;
	System.out.println("physics marks :" +physics);
	System.out.println("chemistry marks :" +chemistry);
	System.out.println("math marks :" +math);
	System.out.println("percentage :" +per );
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
		Semister s =  new Semister ();
		
		
		Semister semister = new Semister();
		s.entermsrk( 70,  80, 90);
		s.show ();

		
		
}
	
}

