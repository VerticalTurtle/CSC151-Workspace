/* Alex McLaurin 10-1-2024
Create a class that holds data about a job applicant. 
Include a name, a phone number, and four Boolean fields that represent whether the applicant is skilled in each of the following areas: word processing, spreadsheets, databases, and graphics. 
Include a constructor that accepts values for each of the fields. Also include a get method for each field. 
Create an application that instantiates several job applicant objects and pass each in turn to a Boolean method that determines whether each applicant is qualified for an interview. 
Then, in the main() method, display an appropriate message for each applicant. 
A qualified applicant has at least three of the four skills. Save the files as JobApplicant.java and TestJobApplicants.java.
 */

public class JobApplicant {
	
	//All our variables
	private String name;
	private String tele;
	private boolean word;
	private boolean excel;
	private boolean access;
	private boolean graphics;
	
	public JobApplicant(String name, String tele, boolean word, boolean excel, boolean access, boolean graphics) {
		this.setName(name);
		this.setTele(tele);
		this.setWord(word);
		this.setExcel(excel);
		this.setAccess(access);
		this.setGraphics(graphics);	
	}
	
	//Setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public boolean isWord() {
		return word;
	}
	public void setWord(boolean word) {
		this.word = word;
	}
	public boolean isExcel() {
		return excel;
	}
	public void setExcel(boolean excel) {
		this.excel = excel;
	}
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	public boolean isGraphics() {
		return graphics;
	}
	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}
		

}
