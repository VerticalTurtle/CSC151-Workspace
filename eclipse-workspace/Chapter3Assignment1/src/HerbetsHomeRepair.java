/* Alex McLaurin 9/10/2024
Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site.
The main() method prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time.
Pass the numeric data to a method that computes an estimate for the job and returns the computed value to the main() method which displays the job name and estimated price.
*/

import java.util.Scanner;

public class HerbetsHomeRepair {

	public static void main(String[] args) {
		
		//initializing scanner and declaring all my variables
		Scanner input = new Scanner(System.in);
		double materialCost;
		double workHours;
		double travelHours;
		double estimatedCost;
		String jobName;
		
		//All prompts for user
		System.out.print("Please enter the name of your current home repair job: ");
		jobName = input.nextLine();

		System.out.print("Please enter the amount of hours the job is estimated to take: ");
		workHours = input.nextDouble();
		
		System.out.print("Please enter how many hours you'll spend traveling to the job site in total: ");
		travelHours = input.nextDouble();
		
		System.out.print("How much will your supplies cost for this job? ");
		materialCost = input.nextDouble();
		
		//passing inputs
		estimatedCost = calcCosts(workHours, travelHours, materialCost);
		
		//final message to user with cost
		System.out.print("The total estimated cost of job: " + jobName + " is $" + estimatedCost);
		
	}

	public static double calcCosts(double workHours, double travelHours, double materialCost) {
		
		double workCost = 35 * workHours;
		double travelCost = 12 * travelHours;
		return materialCost + workCost + travelCost;
		
	}
	
}
