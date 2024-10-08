/* Alex McLaurin 10-1-2024
Write an application that asks a user to enter three integers. Display them in ascending and descending order. Save the file as AscendingAndDescending.java
*/

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {

		//Activate Scanner and get our numbers and set a variable I can use to sort
		Scanner input = new Scanner(System.in);
		int firstNum;
		int secondNum;
		int thirdNum;
		int first;
		int second;
		int third;
		
		
		System.out.print("Please enter an integer: ");
		firstNum = input.nextInt();
		System.out.print("Please enter a second integer: ");
		secondNum = input.nextInt();
		System.out.print("Please enter a third integer: ");
		thirdNum = input.nextInt();
		
		
		//first number is smaller than all or at least one other
		if (firstNum <= secondNum && firstNum <= thirdNum) {
			first = firstNum;
			if (secondNum <= thirdNum) {
				second = secondNum;
				third = thirdNum;
			}	
			else {
				second = thirdNum;
				third = secondNum;
			}
		}
		
		//second number is smaller than both of at least one other
		else if (secondNum <= firstNum && secondNum <= thirdNum) {
			first = secondNum;
			if (firstNum <= thirdNum) {
				second = firstNum;
				third = thirdNum;
			}
			else {
				second = thirdNum;
				third = firstNum;
			}			
		}
		
		//the remaining scenarios, third number is smallest
		else {
			first = thirdNum;
			if (firstNum <= secondNum) {
				second = firstNum;
				third = secondNum;
			}
			else {
				second = secondNum;
				third = firstNum;
			}
		}
		
		//my head hurts, I should've chosen different variable names I think
		//final output
		 System.out.println("Ascending order: " + first + ", " + second + ", " + third);
		 System.out.println("Descending order: " + third + ", " + second + ", " + first);
    
	}

}
