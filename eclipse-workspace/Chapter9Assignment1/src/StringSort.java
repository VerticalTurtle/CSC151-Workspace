/* Alex McLaurin 11-5-2024
Write an application containing an array of 15 String values (that are not originally in alphabetical order), and display them in ascending order. Save the file as StringSort.java.
*/

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
	
		//make our array of random fruits and print it
		String[] fruitTest = {"Apple", "Orange", "Blueberry", "Banana", "Cherry", "Pineapple", "Strawberry", "Kiwi", "Pear", "Peach", "Lime", "Watermelon", "Grape", "Mango", "Lemon"};
		System.out.println("Original array:");
		for (String temp : fruitTest) {
			System.out.println(temp);
		}
		
		//sort it and print again, but sorted
		Arrays.sort(fruitTest);
		System.out.println("****************************");
		System.out.println("Sorted array:");
		for (String temp : fruitTest) {
			System.out.println(temp);
		}	
		
	}
	
}
