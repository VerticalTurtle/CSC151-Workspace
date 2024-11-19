//Alex McLaurin 11-12-2024

public class Candle {
	
	//variables
	private String color;
	private int height;
	protected double price;
	
	//constructor
	public Candle(String color, int height) {
		this.setColor(color);
		this.setHeight(height);
	}
	
	public void printInfo() {
		System.out.println("Color: " + this.getColor());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Price: " + this.getPrice());
	}
	
	//getters/setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
		this.price = height * 2;
	}
	public double getPrice() {
		return price;
	}
	
}
