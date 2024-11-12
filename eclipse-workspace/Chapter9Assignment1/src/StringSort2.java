/* Alex McLaurin 11-5-2024
Write an application that accepts any number of String values from a user up to 15, and display them in ascending order. Save the file as StringSort2.java.
*/

import java.util.Scanner;
import java.util.Arrays;

//see line 33 for why I have this commented out
//import java.text.Collator;

public class StringSort2 {

	public static void main(String[] args) {

		//scanner and variables
		Scanner scanner = new Scanner(System.in);
        int maxStrings = 15;
        String words;
        String[] allWords = new String[maxStrings];
        int count = 0;

        //start asking for strings until 15 are gathered
        System.out.println("Please give me 15 strings to sort.");
        while (count < maxStrings) {
            System.out.println("Enter the string here: ");
            words = scanner.nextLine();
            
            allWords[count] = words;
            count++;
        }
        
        //Same code from StringSort
        //I looked online and found a java utility that sorts by case-insensitive way, but I'm not sure if it's okay to grab that code since we haven't covered it
        //but this code in hindsight doesn't like a mix of upper and lowercase letters
        Arrays.sort(allWords);
        //this is the code I found that sorts case-insensitive
        //Arrays.sort(allWords, Collator.getInstance());
        System.out.println("****************************");
		System.out.println("Your sorted array of strings:");
		for (String temp : allWords) {
			System.out.println(temp);
		}
	}
}