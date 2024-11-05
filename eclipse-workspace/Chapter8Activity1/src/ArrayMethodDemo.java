/* Alex McLaurin 10-29-2024
Create an application containing an array that stores eight integers. The application should call five methods that in turn 
(1) display all the integers
(2) display all the integers in reverse order 
(3) display the sum of the integers
(4) display all values less than a limiting argument
(5) display all values that are higher than the calculated average value. 
Save the file as ArrayMethodDemo.java.
 */

public class ArrayMethodDemo {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		displayAll(numbers);
		displayReverse(numbers);
		int sum = displaySum(numbers);
		displayAllLessThan(numbers,5);
		displayAllGreaterThanAvg(numbers,sum);
	
	}

	private static void displayAll(int[] numbers) {
		for(int val : numbers) {
			System.out.print(val + " ");
		}	
		System.out.println();	
	}

	private static void displayReverse(int[] numbers) {
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}	
		System.out.println();
	}

	private static int displaySum(int[] numbers) {
		int sum = 0;
		for(int val : numbers) {
			sum = sum + val;
		}
		System.out.println("The sum of the numbers is: " + sum);
		return sum;	
	}

	private static void displayAllLessThan(int[] numbers, int i) {
		for(int val : numbers) {
			if(val < i) {
				System.out.print(val + " ");		
			}
			else {
				break;
			}
		}
		System.out.println();
	}

	private static void displayAllGreaterThanAvg(int[] numbers, int sum) {
		double avg = (double)sum/numbers.length;
		for(int val : numbers) {
			if(val > avg) {
				System.out.print(val + " ");
			}
		}
	}
	
}