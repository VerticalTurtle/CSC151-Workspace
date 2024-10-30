/* Alex McLaurin 10-10-2024

Write an application that counts the words in a String entered by a user. 
Words are separated by any combination of spaces, periods, commas, semicolons, question marks, exclamation points, or dashes.

*/

import java.util.Scanner;

public class StringCounter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*making a test string to make sure it worked
		String test = "anything          can! go .,:?! -here !? anything-- at ...all,";
		System.out.println(test);
		*/
		
		//input from user
		System.out.print("Please enter a sentence that you would like me to count the words in: ");
		String test = input.nextLine();
		
		//replacing odd things with spaces
		test = test.replace("?", " ");
		test = test.replace(".", " ");
		test = test.replace(",", " ");
		test = test.replace("-", " ");
		test = test.replace("!", " ");
		test = test.replace(":", " ");
		int lenOld = test.length();
		int lenNew = 0;
		
		/*A test print to show that the spaces are condensed
		* System.out.println(test);
		*/
		
		for(int i = 0; i < test.length(); i++) {
			test = test.replace("  ", " ");
			lenNew = test.length();
			if(lenOld == lenNew) {
				break;
			}
			else {
				lenOld = lenNew;
			}
			//System.out.println(test);
		}
		
		int words = 0;
		for(int i = 0; i < test.length(); i++) {
			if(test.charAt(i) == ' ') {
				words++;
			}
		}
		
		//Final Test
		System.out.println("The number of words is in that sentence is: " + (words++) + " words.");
		
		//thank you Prof. Flannery for the suggestion on how to be rid of odd spaces/characters!
	}

}
