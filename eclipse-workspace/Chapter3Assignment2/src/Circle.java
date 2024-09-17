//Alex McLaurin 9/17/2024

public class Circle {

	private double radius;
	private double diameter;
	private double area;
	
	//Constructor for default circle values
	public Circle() {
		radius = 1;
		diameter = radius * 2;
		area = Math.PI * (radius * radius);
	}
	
	//Getter
	double getRadius() {
		return radius;
	}
	double getDiameter() {
		return diameter;
	}
	double getArea() {
		return area;
	}
	
	//Setter
	void setRadius(double radiusNumber) {
		radius = radiusNumber;
		diameter = radiusNumber * 2;
		area = Math.PI * (radius * radius);
	}
		
}
