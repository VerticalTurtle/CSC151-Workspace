//Alex McLaurin 11-12-2024

public class CustomTee extends TeeShirt {
	
	private String slogan;
	
	public CustomTee(int orderNum, String size, String color, String slogan) {
		super(orderNum, size, color);
		this.setSlogan(slogan);
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Slogan: " + this.getSlogan());
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
}
