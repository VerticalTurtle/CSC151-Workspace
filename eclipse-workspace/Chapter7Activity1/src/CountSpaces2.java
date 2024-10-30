/* Alex McLaurin 10-17-24

Create a program that contains a string that holds your favorite inpsirational quote and displays the total number of spaces contained in the string.
Save it as CountSpaces.java
Write an application that counts the total number of spaces contained in a quote entered by the user. Save as CountSpaces2.java

 */

import java.util.Scanner;

public class CountSpaces2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String quote;
		int count = 0;
		
		//get quote
		System.out.print("Enter your favorite quote: ");
		quote = input.nextLine();
		
		//when i see's a 0, count increases
		for (int i = 0; i < quote.length(); i++) {
			if(quote.charAt(i) == ' ')
				count++;
			
		}
		
		System.out.println("Your input has " + count + " spaces.");
	}

}
