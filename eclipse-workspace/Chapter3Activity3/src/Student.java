// Alex McLaurin 9/17/2024

public class Student {
	
	private int id;
	private int creditHours;
	private int points;
	
	//Making a constructor to assign some default values
	public Student() {
		id = 999;
		creditHours = 6;
		points = 24;
	}
	
	//Getters
	int getID() {
		return id;
	}
	
	int getCreditHours() {
		return creditHours;
	}
	
	int getPoints(){
		return points;
	}
	
	//Setters
	void setID(int idNumber) {
		id = idNumber;
	}
	
	void setCreditHours(int hrs) {
		creditHours = hrs;
	}
	
	void setPoints(int pts) {
		points = pts;
	}
	
	//Our GPA method since all the things needed to calc it are inside this class
	double getGPA() {
		//by putting double in front of points this makes the system force the ints into a double since GPA is a double
		double GPA = (double)points/creditHours;
		return GPA;
	}
		
}