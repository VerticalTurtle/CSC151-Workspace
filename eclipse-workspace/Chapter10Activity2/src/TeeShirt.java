//Alex McLaurin 11-12-2024

public class TeeShirt {

	//vars
	private int orderNum;
	private String size;
	private String color;
	private double price;
	
	//constructor
	public TeeShirt(int orderNum, String size, String color) {
		this.setOrderNum(orderNum);
		this.setSize(size);
		this.setColor(color);
	}
	
	//our printinfo
	public void printInfo() {
		System.out.println("Order number: " + this.getOrderNum());
		System.out.println("Size: " + this.getSize());
		System.out.println("Color: " + this.getColor());
		System.out.println("Price: " + this.getPrice());
	}
	
	//getters/setters
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
		if (size.equals("XXL") || size.equals("XXXL")) {
			this.price = 22.99;
		} else {
			this.price = 19.99;
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}

}
