/*Alex McLaurin 11-5-2024
Create a CarTest class. You will create three Car objects, put them in an ArrayList and pass the list to a function that will take the objects out of the list and print the object’s properties
*/

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {	
		Car one = new Car ("Chevy", "Malibu", 2019);
		Car two = new Car ("Chevy", "S10", 2004);
		Car three = new Car ("Mercury", "Sable", 1995);
		ArrayList<Car> garage = new ArrayList<Car>();
		garage.add(one);
		garage.add(two);
		garage.add(three);
		getCars(garage);
	}

	private static void getCars(ArrayList<Car> garage) {
		for(int i = 0; i < garage.size(); i++) {
			(garage.get(i)).printProperties();
		}
		
	}
	
}
