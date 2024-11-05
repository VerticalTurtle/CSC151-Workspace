/* Alex McLaurin 10-29-2024
Write an application that allows a user to enter the names and birthdates of up to 10 friends. 
Continue to prompt the user for names and birthdates until the user enters the sentinel value ZZZ for a name or has entered 10 names, whichever comes first. 
When the user is finished entering names, produce a count of how many names were entered, and then display the names. 

In a loop, continuously ask the user to type one of the names and display the corresponding birthdate or an error message if the name has not been previously entered. 
The loop continues until the user enters ZZZ for a name. Save the application as BirthdayReminder.java.
 */

import java.util.Scanner;

public class BirthdayReminder {
    
	public static void main(String[] args) {
        
		//scanner and variables
		Scanner scanner = new Scanner(System.in);
        int maxFriends = 10;
        String name;
        String birthdate;
        String[] names = new String[maxFriends];
        String[] birthdates = new String[maxFriends];
        int count = 0;

        //start asking for names until 10 or ZZZ
        while (count < maxFriends) {
            System.out.println("Enter a friend's name (or 'ZZZ' to stop): ");
            name = scanner.nextLine();
            
            //break if zzz
            if (name.equalsIgnoreCase("ZZZ")) {
                break;
            }

            //get birthday
            System.out.println("Enter " + name + "'s birthdate: ");
            birthdate = scanner.nextLine();

            names[count] = name;
            birthdates[count] = birthdate;
            count++;
        }

        //printing how many names and names
        System.out.println("You have entered " + count + " friends.");
        System.out.println("Names of friends:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }

        //loop to ask for names
        while (true) {
            System.out.println("Enter a friend's name to display the birthdate (or 'ZZZ' to stop): ");
            name = scanner.nextLine();
            
            //again break if zzz
            if (name.equalsIgnoreCase("ZZZ")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println(names[i] + "'s birthdate is " + birthdates[i]);
                    found = true;
                    break;
                }
            }
            
            //making an error message
            if (!found) {
                System.out.println("Error: you never entered " + name + "'s name.");
            }
        }
    }
}
