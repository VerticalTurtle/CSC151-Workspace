/* Alex McLaurin 10-24-2024
Modify the CountByFives application so that the user enters the value to count by. Start each new line after 10 values have been displayed. 
Save the file as CountByAnything.java.
*/

import java.util.Scanner;

public class CountByAnything {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int countBy;
		int loopCounter;
		int entries = 1;
		
		System.out.print("Please enter the number you want to count by: ");
		countBy = input.nextInt();
		loopCounter = countBy;
		
		while(loopCounter <= 500) {
			System.out.print(loopCounter + " ");
			if(entries % 10 == 0)
				System.out.println();
			entries = entries + 1;
			loopCounter = loopCounter + countBy;
			
		}
	}
}
