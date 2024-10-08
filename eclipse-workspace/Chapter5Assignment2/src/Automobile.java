/*Alex McLaurin 10-1-2024

Create an Automobile class for a dealership. Include fields for an ID number, make, model, color, year, and miles per gallon. Include get and set methods for each field. 
Do not allow the ID to be negative or more than 9999; if it is, set the ID to 0. 
Do not allow the year to be earlier than 2005 or later than 2019; if it is, set the year to 0. 
Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the miles per gallon to 0. 
Include a constructor that accepts arguments for each field value and uses the set methods to assign the values. 
Write an application that declares several Automobile objects and demonstrates that all the methods work correctly. Save the files as Automobile.java and TestAutomobiles.java.
 
 */

public class Automobile {
	
	//variables
	private int idNumber;
	private String make;
	private String model;
	private String color;
	private int year;
	private int mpg;
	
	//the car
	public Automobile(int idNumber, String make, String model, String color, int year, int mpg) {
		this.setIdNumber(idNumber);
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setYear(year);
		this.setMpg(mpg);
	}
	
	//Getters and setters
	public int getIdNumber() {
		return idNumber;
	}
	
	//ID number can't equal 0 or >9999
	public void setIdNumber(int idNumber) {
		if (idNumber < 0 || idNumber >9999) {
			this.idNumber = 0;
		}
		else {
			this.idNumber = idNumber;
		}
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
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year;
	}
	
	//year can't equal <2005 or >2019
	public void setYear(int year) {
		if (year < 2005 || year > 2019) {
			this.year = 0;
		}
		else {
			this.year = year;
		}
	}
	
	public int getMpg() {
		return mpg;
	}
	
	//mpg can't equal <10 or >60
	public void setMpg(int mpg) {
		if (mpg < 10 || mpg > 60) {
			this.mpg = 0;
		}
		else {
			this.mpg = mpg;
		}
	}
}
