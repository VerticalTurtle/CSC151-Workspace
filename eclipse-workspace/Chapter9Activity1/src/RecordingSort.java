/* Alex McLaurin 11-5-2024
Write an application that instantiates five Recording objects and prompts the user for values for the data fields. 
Then prompt the user to enter which field the Recordings should be sorted by—song title, artist, or playing time. 
Perform the requested sort procedure, and display the Recording objects. Save the file as RecordingSort.java.
*/

import java.util.Scanner;

public class RecordingSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Recording [] record = new Recording[5];
		
		record[0] = new Recording("Straberry Heart ", "Mira", 3);
		record[1] = new Recording("Heart Like a Truck ", "Lainie Wilson", 4);
		record[2] = new Recording("Wenn Liebe Kommt ", "Lotte", 5);
		record[3] = new Recording("Schau Mich Nicht So An ", "Lotte", 2);
		record[4] = new Recording("Viel Zu Viel (Nicht Genug) ", "Lotte", 2);
		
		System.out.println("Enter 1 to sort by title ");
		System.out.println("Enter 2 to sort by artist ");
		System.out.print("Enter 3 to sort by song length: ");
		int code = input.nextInt();
		
		if (code == 1) 
			sortTitle(record);
		else if (code == 2)
			sortArtist(record);
		else
			sortTime(record);
		printArray(record);
	}

	private static void printArray(Recording[] record) {
		for(int j=0 ; j < record.length ; j++) {
			record[j].printProperties();
		}
		
	}

	private static void sortTitle(Recording[] record) {
		Recording temp;
		for(int i = 0 ; i < record.length ; i++) {
			for(int j=0 ; j < record.length - 1 ; j++) {
				if(record[j].getTitle().compareTo(record[j+1].getTitle()) > 0) {
					temp = record[j];
					record[j] = record[j+1];
					record[j+1] = temp;
				}
			}
		}
	}

	private static void sortArtist(Recording[] record) {
		Recording temp;
		for(int i = 0 ; i < record.length ; i++) {
			for(int j=0 ; j < record.length - 1 ; j++) {
				if(record[j].getArtist().compareTo(record[j+1].getArtist()) > 0) {
					temp = record[j];
					record[j] = record[j+1];
					record[j+1] = temp;
				}
			}
		}
	}

	private static void sortTime(Recording[] record) {
		Recording temp;
		for(int i = 0 ; i < record.length ; i++) {
			for(int j=0 ; j < record.length - 1 ; j++) {
				if(record[j].getTime() > record[j+1].getTime()) {
					temp = record[j];
					record[j] = record[j+1];
					record[j+1] = temp;
				}
			}
		}
	}
}
