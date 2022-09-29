

public class Shape {

	int l_ofrect,b_ofrect;
	float h_oftring,l_oftring;
	double r_ofcircule;
	
	public void calculate_area(int length,int breatdh  ) {
		System.out.println("area of reactangle :" + length*breatdh);
		
	}
	public void calculate_area(float height, float length) {
		System.out.println("area of Triangle :" + (length*height)/2);
		
	}
	public void calculate_area(double radious) {
		System.out.println("area of circule :" +3.14*radious*radious );
		
	}
	
	public static void main (String []args) {
		Shape a= new Shape ();
		a.calculate_area(5, 10);
		a.calculate_area(12, 6);
		a.calculate_area(10);
	}

	
}

