/* Alex McLaurin 9/24/24
    Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –). 
    Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. 
    Include get and set methods for each field.
    
    Create a class named Patient that includes an ID number, age, and BloodData.
    Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +. 
    Create an overloaded constructor that provides values for each field. Also provide get methods for each field. 
    Save the file as Patient.java. Create an application that demonstrates that each method works correctly, and save it as TestPatient.java
*/

public class BloodData {
	
	private String type;
	private String factor;
	
	
	public BloodData() {
		this("O","+");
		//this.setType("0");
		//this.setFactor("+");
	}

	public BloodData(String type, String factor) {
		this.setType(type);
		this.setFactor(factor);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFactor() {
		return factor;
	}
	public void setFactor(String factor) {
		this.factor = factor;
	}
	

}
