/* Alex McLaurin 10-24-2024
Write an application that counts by five from 5 through 500 inclusive, and that starts a new line after every multiple of 50 (50, 100, 150, and so on).
Save the file as CountByFives.java.
*/

public class CountByFives {

	public static void main(String[] args) {
		int countBy = 5;
		int loopCounter = countBy;
		
		while(loopCounter <= 500) {
			System.out.print(loopCounter + " ");
			if(loopCounter % 50 == 0)
				System.out.println();
			loopCounter = loopCounter + 5;
			
		}
	}

}
