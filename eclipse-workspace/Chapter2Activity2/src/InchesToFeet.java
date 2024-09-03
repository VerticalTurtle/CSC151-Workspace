// Alex McLaurin 9/3/24 Write a program that displays a value in feet and inches

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		int inches;
		int feet;
		int remainder;
		final int INCHES_IN_A_FOOT = 12;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value of inches ");
		
		inches = input.nextInt();
		feet = inches / INCHES_IN_A_FOOT;
		remainder = inches % INCHES_IN_A_FOOT;
		
		System.out.println(inches + " inches equals " + feet + " feet and " + remainder + " inches");
	}

}
