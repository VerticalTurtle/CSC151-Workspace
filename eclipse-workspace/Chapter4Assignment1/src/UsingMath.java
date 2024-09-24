/*Alex McLaurin 9/24/24

Ensure your app prints out the value of each item with explanatory text such as

The square root of 37 is 6.12.... 
The sine of 300 is .......
The cosine of 300 is .....

Write a Java application that uses the Math class to determine the answers for each of the following:
    The square root of 37
    The sine and cosine of 300
    The value of the floor, ceiling, and round of 22.8
    The larger and the smaller of the character ‘D’ and the integer 71
    A random number between 0 and 20(Hint: The random() method returns a value between 0 and 1; you want a number that is 20 times larger.)
    
 */

public class UsingMath {
	
	public static void main(String[] args) {
		System.out.println("The square root of 37 is: " + Math.sqrt(37));
		System.out.println("The sine of 300 is: " + Math.sin(300)  + ".");
		System.out.println("The cosine of 300 is: " + Math.cos(300) + ".");
		System.out.println("The value of the floor of 22.8 is: " + Math.floor(22.8) + ".");
		System.out.println("The value of the ceiling of 22.8 is: " + Math.ceil(22.8) + ".");
		System.out.println("The value of the round of 22.8 is: " + Math.round(22.8) + ".");
		System.out.println("The larger value of the character 'D' and the integer 71 is: " + Math.max('D', 71) + ", and smaller value is: " + Math.min('D', 71) + ".");
		System.out.println("A random number between 0 and 20 is: " + (Math.random() * 20));		
	}

}
