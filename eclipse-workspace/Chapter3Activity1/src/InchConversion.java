/* Alex McLaurin 9/10/2024
Create a class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. 
One converts the value from inches to feet, and the other converts the same value from inches to yards.
*/

import java.util.Scanner;

public class InchConversion {

	public static void main(String[] args) {
		double inches;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in inches:");
		inches = input.nextDouble();
		calcFeet(inches);
		calcYards(inches);
	}

	public static void calcFeet(double inches) {
		double feet = inches/12;
		System.out.println(inches + " inches equals " + feet + " feet");
		
	}
	
	public static void calcYards(double inches) {
		double yards = inches/36;
		System.out.println(inches + " inches equals " + yards + " yard(s)");
		
	}
	
	
}
