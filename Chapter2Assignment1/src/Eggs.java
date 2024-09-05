//Alex McLaurin 9/3/2024 Write a program that prompts a user for the number of eggs in the order, and then display the amount owed with a full explanation.

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		int eggs;
		int singleEgg;
		int dozenEgg;
		int cents = 45;
		double totalCost;
		final int NUMBER_IN_DOZEN = 12;
		final double COST_OF_SINGLE = .45;
		final double COST_OF_DOZEN = 3.25;		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter many eggs would you like to order: ");
		
		eggs=input.nextInt();
		dozenEgg = eggs / NUMBER_IN_DOZEN;
		singleEgg = eggs % NUMBER_IN_DOZEN;
		totalCost = (dozenEgg * COST_OF_DOZEN) + (singleEgg * COST_OF_SINGLE);
		
		System.out.println("You have ordered " + eggs +" eggs. " + "That's " + dozenEgg + " dozen at $" + COST_OF_DOZEN + " per dozen and " + singleEgg + " loose egg(s) at " + cents + " cents each for a total of $" + totalCost + ".");
		
		
		//I declared an extra int of cents to make the output dialogue match what's needed for the assignment, I could have also just used a string. Not sure which is better?
		
	}

}
