/*Alex McLaurin 10-1-2024

Write an application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java.

*/

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		if(number % 2 == 0)
		{
			System.out.println("That was an even number.");
		}
		else 
		{
			System.out.println("That was an odd number.");
		}
	}

}
