package oddoreven;

public class AreaOf3 {
	void area(float a) {
		System.out.println("Area of square is " + a*a);
	}
	
	void area(float x, float y) {
		System.out.println("Area of rectangle is " + x*y);
	}
	void area(double r) {
		System.out.println("Area of circle is " + 3.14*r*r);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

AreaOf3 obj = new AreaOf3();
obj.area(10);
obj.area(12, 8);
obj.area(6.01);
	}

}
