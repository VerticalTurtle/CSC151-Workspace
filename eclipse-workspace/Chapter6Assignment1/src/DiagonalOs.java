/* Alex McLaurin 10-24-2024
Write an application that uses a loop to create the pattern of Os shown in Figure 6-32, in which each O is displayed one additional space to the right. Save the file as DiagonalOs.java.
*/

public class DiagonalOs {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			String space = "";
			for(int letterO = 0; letterO < i; letterO++) {
				space += " ";
			}
			space += "O";
			System.out.println(space);
		}
		
	}

}
