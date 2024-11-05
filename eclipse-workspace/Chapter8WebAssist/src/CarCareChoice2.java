/* Alex McLaurin 10-24-2024
It might not be reasonable to expect users to type long entries such as “oil change” accurately. 
Modify the CarCareChoice class so that as long as the user enters the first three characters of a service, the choice is considered valid. 
Save the file as CarCareChoice2.java.
*/

import java.util.Scanner;

public class CarCareChoice2 {
    
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
        System.out.println("Enter the service, or the first three letters of the service, you would like: ");
        String userChoice = scanner.nextLine().toLowerCase();

        //compare to the list, and made it ignore case
        boolean isValidChoice = false;
        for (int i = 0; i < services.length; i++) {
            if (services[i].toLowerCase().startsWith(userChoice)) {
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
