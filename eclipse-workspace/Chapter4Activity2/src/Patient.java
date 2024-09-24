//Alex McLaurin 9/24/24

public class Patient {
	
	private int age;
	private int id;
	private BloodData bd;
	
	public Patient() {
		this(0,0,"O","+");
		//this.setAge(0);
		//this.setId(0);
		//bd = new BloodData();
	}
	
	public Patient(int age, int id, String type, String factor) {
		this.setAge(age);
		this.setId(id);
		bd = new BloodData(type, factor);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BloodData getBd() {
		return bd;
	}	

}
