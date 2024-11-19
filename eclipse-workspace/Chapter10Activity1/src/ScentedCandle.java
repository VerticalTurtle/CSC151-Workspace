//Alex McLaurin 11-12-2024

public class ScentedCandle extends Candle {
	private String scent;

	public ScentedCandle(String color, int height, String scent) {
		super(color, height);
		this.setScent(scent);
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Scent: " + this.getScent());
	}
	
	public void setHeight(int height) {
		super.setHeight(height);
		this.price = height * 10;
	}
	
	public String getScent() {
		return scent;
	}
	
	public void setScent(String scent) {
		this.scent = scent;
	}

}
