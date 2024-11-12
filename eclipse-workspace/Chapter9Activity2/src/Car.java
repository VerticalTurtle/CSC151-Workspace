/* Alex McLaurin 11-5-2024
First create a Car class. It will have three properties and they are make, model and year. 
Create a constructor the will set this three properties after you create getters and setters for each property. Add a printProperties method.
*/

public class Car {

	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);	
	}
	
	public void printProperties() {
		System.out.println("*************************");
		System.out.println("Make: " + this.getMake());
		System.out.println("Model: " + this.getModel());
		System.out.println("Year: " + this.getYear());
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	


}
