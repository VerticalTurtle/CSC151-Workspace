/* Alex McLaurin 11-12-2024
Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include an order number, size, color, and price. 
Create set methods for the order number, size, and color and get methods for all four fields. 
The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 
Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the slogan requested for the shirt, and include get and set methods this field. 
Write an application that creates two objects of each class, and demonstrate that all the methods work correctly. 
Save the files as TeeShirt.java, CustomTee.java, and DemoTees.java. 
*/

public class DemoTees {

	public static void main(String[] args) {
		
		TeeShirt one = new TeeShirt(395, "XXL", "Black");
		TeeShirt two = new TeeShirt(396, "XS", "Red");
		
		CustomTee three = new CustomTee(397, "XXXL", "Blue", "Blue skys fade away");
		CustomTee four = new CustomTee(398, "M", "Grey", "Overcast skys high");
		
		one.printInfo();
		two.printInfo();
		three.printInfo();
		four.printInfo();
	}

}
