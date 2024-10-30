/* Alex McLaurin 10-17-2024

Write a program that inserts parentheses, a space, and a dash into a string of 10 user-entered numbers to format it as a phone number. 
For example, 5153458912 becomes (515) 345-8912. 
If the user does not enter exactly 10 digits, display an error message. 

Continue to accept user input until the user enters 999. 

*/

import java.util.Scanner;

public class PhoneNumberFormatter {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		String number = "null";
		String newNumber;
		
		System.out.print("Please enter a 10-digit phone number you would like me to format: ");
		number = input.next();
		
		while(number.length() != 10) {
			System.out.print("Error ---> Please enter a 10-digit phone number you would like me to format: ");
			number = input.next();
		} 

		newNumber = "(" + number.substring(0,3) + ") " + number.substring(3,6) + "-" + number.substring(6);
		System.out.println("The formatted number is: " + newNumber);
		 
		
	}

}
