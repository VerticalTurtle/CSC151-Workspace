/* Alex McLaurin 10-24-2024
Write an application for Cody’s Car Care Shop that shows a user a list of available services: oil change, tire rotation, battery check, or brake inspection. 
Allow the user to enter a string that corresponds to one of the options, and display the option and its price as $25, $22, $15, or $5, accordingly. 
Display an error message if the user enters an invalid item. Save the file as CarCareChoice.java.
*/

import java.util.Scanner;

public class CarCareChoice {
	
    public static void main(String[] args) {
    	
    	//scanner, name array, and prices array
        Scanner scanner = new Scanner(System.in);
        String[] services = {"Oil change", "Tire rotation", "Battery check", "Brake inspection"};
        int[] prices = {25, 22, 15, 5};

        //print out services
        System.out.println("Cody’s Car Care services:");
        for (String service : services) {
            System.out.println("- " + service);
        }

        //choose service
        System.out.println("Enter the service you would like: ");
        String userChoice = scanner.nextLine();

        //compare to the list, and made it ignore case
        boolean isValidChoice = false;
        for (int i = 0; i < services.length; i++) {
            if (userChoice.equalsIgnoreCase(services[i])) {
                System.out.println("You selected: " + services[i]);
                System.out.println("The price is: $" + prices[i]);
                isValidChoice = true;
                break;
            }
        }

        //error message
        if (!isValidChoice) {
            System.out.println("Error: Invalid service choice.");
            
        }
    }
}
