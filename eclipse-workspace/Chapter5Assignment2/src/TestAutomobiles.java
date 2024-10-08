//Alex McLaurin 10-1-2024

public class TestAutomobiles {

	public static void main(String[] args) {
		
		//seven cars to check all the different conditions for the code
		Automobile car1 = new Automobile(349, "Mercury", "Sable", "White", 2010, 18);
		Automobile car2 = new Automobile(10204, "Mercury", "Sable", "White", 2010, 18);
		Automobile car3 = new Automobile(-435, "Mercury", "Sable", "White", 2010, 18);
		Automobile car4 = new Automobile(350, "Mercury", "Sable", "White", 1995, 18);
		Automobile car5 = new Automobile(351, "Mercury", "Sable", "White", 2050, 18);
		Automobile car6 = new Automobile(352, "Mercury", "Sable", "White", 2010, 5);
		Automobile car7 = new Automobile(353, "Mercury", "Sable", "White", 2010, 90);
	
		//testAutomobile(one);
		//eclipse recommended I changed it display, googling it made it look like it'd be a good way to use that command
		displayAutomobile(car1);
		displayAutomobile(car2);
		displayAutomobile(car3);
		displayAutomobile(car4);
		displayAutomobile(car5);
		displayAutomobile(car6);
		displayAutomobile(car7);	
	}
		
		//home stretch, the final displays
		public static void displayAutomobile(Automobile car) {
	        System.out.println("ID: " + car.getIdNumber());
	        System.out.println("Make: " + car.getMake());
	        System.out.println("Model: " + car.getModel());
	        System.out.println("Color: " + car.getColor());
	        System.out.println("Year: " + car.getYear());
	        System.out.println("Miles per Gallon: " + car.getMpg());
	        System.out.println();
	
		}
}
