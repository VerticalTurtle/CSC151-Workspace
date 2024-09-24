/* Alex McLaurin 9/17/2024

Create a class named Circle with fields named radius, diameter, and area. 
Include a constructor that sets the radius to 1 and calculates the other two values. Also include methods named setRadius()and getRadius(). 
The setRadius()method not only sets the radius, but it also calculates the other two values. 
(The diameter of a circle is twice the radius, and the area of a circle is pi multiplied by the square of the radius. Use the Math class PI constant for this calculation.)

Create aTestCircle class with a main method to test all the functions in your Circle class.

 */

public class TestCircle {

	public static void main(String[] args) {

		Circle circleOne = new Circle();
		Circle circleTwo = new Circle();
		
		//Test radius to show everything works
		//I changed this to a different number to make this distinct from Ch3Activity2 :)
		circleTwo.setRadius(10);
		
		System.out.println("The radius of the circle one is: " + circleOne.getRadius());
		System.out.println("The diameter of the circle one is: " + circleOne.getDiameter());
		System.out.println("The area of the circle one is: " + circleOne.getArea());
		
		System.out.println("The radius of the circle two is: " + circleTwo.getRadius());
		System.out.println("The diameter of the circle two is: " + circleTwo.getDiameter());
		System.out.println("The area of the circle two is: " + circleTwo.getArea());
		
	}

}
