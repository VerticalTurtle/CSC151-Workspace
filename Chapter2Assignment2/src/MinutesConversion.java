// Alex McLaurin 9/3/2024 Write a program that accepts a number of minutes and converts it both to hours and days.

import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {
		int minutes;
		double hours;
		double days;
		final double MINUTES_IN_HOUR = 60;
		final double HOURS_IN_DAY = 24;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of minutes you would like to convert: ");

		minutes=input.nextInt();
		hours = minutes / MINUTES_IN_HOUR;
		days = hours / HOURS_IN_DAY;
		
		System.out.println("You have entered " + minutes + " minutes, this is equal to " + hours + " hours, and " + days + " days.");
		
	}

}
