/* Alex McLaurin 10-24-2024
The Huntington High School basketball team has five players named Art, Bob, Cal, Dan, and Eli. 
Accept the number of points scored by each player in a game and create a bar chart that illustrates the points scored by displaying an asterisk for each point. 
The output looks similar to the chart in Figure 6-34. Save the file as BarChart.java.
*/

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//Once we learn arrays we could just add all of these values to an array and go from there I think, this feels like a little bit of a mess as is
		//Asking user for players points and storing points
		System.out.print("Please enter the amount of points Art scored: ");
		int pointsArt = input.nextInt();
		System.out.print("Please enter the amount of points Bob scored: ");
		int pointsBob = input.nextInt();
		System.out.print("Please enter the amount of points Cal scored: ");
		int pointsCal = input.nextInt();
		System.out.print("Please enter the amount of points Dan scored: ");
		int pointsDan = input.nextInt();
		System.out.print("Please enter the amount of points Eli scored: ");
		int pointsEli = input.nextInt();
		
		//Making the chart
		System.out.println("Points for Game\n");
		System.out.print("Art: ");
		printAsterisks(pointsArt);
		System.out.print("Bob: ");
		printAsterisks(pointsBob);
		System.out.print("Cal: ");
		printAsterisks(pointsCal);
		System.out.print("Dan: ");
		printAsterisks(pointsDan);
		System.out.print("Eli: ");
		printAsterisks(pointsEli);
		
		}
	
	private static void printAsterisks(int points) {
		for(int i = 0; i < points; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
	}
}
