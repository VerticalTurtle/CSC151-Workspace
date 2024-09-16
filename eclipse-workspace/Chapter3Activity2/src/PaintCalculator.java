/* Alex McLaurin 9/10/2024
 Write a program that calculates the area of a room, pass this value to a method that calculates how much paint is needed, displays how much is needed, and computes a price for the paint.
*/

import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		double length, width, height;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length, width, and height of the room, seperated by spaces: ");
		length = input.nextDouble();
		width = input.nextDouble();
		height = input.nextDouble();
		double price = calcWallArea(length, width, height);
		System.out.println("The final price for all of the paint is $" + price);
		
	}

	public static double calcWallArea(double length, double width, double height) {
		double area = (length * height + width * height) * 2;
		double price = calcGallons(area);
		return price;
		
	}

	public static double calcGallons(double area) {
		double gallons = Math.ceil(area / 350);
		System.out.println("You need " + gallons + " gallons of paint to paint the room.");
		double price = gallons * 32;
		return price;
		
	}

}
