/* Alex McLaurin 10-24-2024
Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a double annual sales amount. 
Methods include a constructor that requires values for both data fields, as well as get and set methods for each of the data fields. 
Write an application named DemoSalesperson that declares an array of 10 Salesperson objects. 
Set each ID number to 9999 and each sales value to zero. Display the 10 Salesperson objects. 
Save the files as Salesperson.java and DemoSalesperson.java.
    
Modify the DemoSalesperson application so each Salesperson has a successive ID number from 111 through 120 
and a sales value that ranges from $25,000 to $70,000, increasing by $5,000 for each successive Salesperson. 
Save the file as DemoSalesperson2.java.
*/

import java.text.NumberFormat;

public class Salesperson {
	NumberFormat nf;
	private int id;
	private double sales;
	public Salesperson(int id, double sales) {
		this.setId(id);
		this.setSales(sales);
		nf = NumberFormat.getCurrencyInstance();
	}
	
	public String toString() {
		String values = "Id " + this.getId() + " Sales " + this.nf.format(getSales());
		return values;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getSales() {
		return sales;
	}
	
	public void setSales(double sales) {
		this.sales = sales;
	}

}
