/* Alex McLaurin 9/24/24
Create a class named Billing that includes three overloaded computeBill()methods for a photo book store.

• When computeBill() receives a single parameter, it represents the price of one photo book ordered. 
Add 8% tax, and return the total due.

• When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. 
Multiply the two values, add 8% tax, and return the total due.

• When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. 
Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due. 

*/

public class Billing {

	public static void main(String[] args) {
		double price = 10;
		double cost;
		double couponValue = 2;
		cost = computeBill(price);
		System.out.println("First bill " + cost);
		cost = computeBill(price,5);
		System.out.println("Second bill " + cost);
		cost = computeBill(price,5,couponValue);
		System.out.println("Third bill " + cost);
		
	}
	
	public static double computeBill(double price) {
		return (price * 1.08);
	}
	
	public static double computeBill(double price, int number) {
		return (price * 1.08 * number);
	}

	public static double computeBill(double price, int number, double couponValue) {
		return ((price * 1.08 * number) - couponValue);
	}
}
