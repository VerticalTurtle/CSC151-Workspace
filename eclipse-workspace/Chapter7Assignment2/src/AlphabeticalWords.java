/* Alex McLaurin 10-17-2024

Write an application that accepts three unique Strings from the user and, without regard to case, appropriately displays either 
"You did not enter the words in alphabetical order" or "You entered the strings in alphabetical order" depending on whether the Strings were entered in alphabetical order. 
Write an application that accepts three Strings from the user and displays them in alphabetical order without regard to case. 

I really wanted to use arrays for this, I did consult some old posts on stack overflow to try and do this the way the assignment asked for. I hope that's acceptable, but I understand if I lose points for it.
*/

import java.util.Scanner;

public class AlphabeticalWords {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    //Get our three strings
    System.out.print("Please enter the first string: ");
    String string1 = input.nextLine();
    
    System.out.print("Please enter the second string: ");
    String string2 = input.nextLine();

    System.out.print("Please enter the third string: ");
    String string3 = input.nextLine();
    
    //Checking to see if the strings are in alphabetical order
    if (string1.compareToIgnoreCase(string2) <= 0 && string2.compareToIgnoreCase(string3) <= 0) {
      System.out.println("You entered the strings in alphabetical order.");
    } else {
      System.out.println("You did not enter the words in alphabetical order.");
    }
    
    //Sorting the strings
    String temp;
    
    //this ensures string 1 is the smallest by swapping it around
    if(string1.compareToIgnoreCase(string2) > 0) {
    	temp = string1;
    	string1 = string2;
    	string2 = temp;
    }    
    if (string1.compareToIgnoreCase(string3) > 0) {
    	temp = string1;
    	string1 = string3;
    	string3 = temp;
    }
    
    //now we compare the others
    if (string2.compareToIgnoreCase(string3) > 0) {
    	temp = string2;
    	string2 = string3;
    	string3 = temp;
    }
    
    //final print
    System.out.println("The strings in order: " + string1 + " " + string2 + " " + string3);
   
	}
  
}     