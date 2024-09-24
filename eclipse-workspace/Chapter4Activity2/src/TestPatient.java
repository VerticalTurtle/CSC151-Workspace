//Alex McLaurin 9/24/24

public class TestPatient {

	public static void main(String[] args) {
		Patient Alex = new Patient();
		Patient Katie = new Patient(34, 12345, "AB","+");
		
		System.out.println("Age: 	" + Alex.getAge());
		System.out.println("Id: 	" + Alex.getId());
		System.out.println("Type:	" + Alex.getBd().getType());
		System.out.println("Factor: " + Alex.getBd().getFactor());
		System.out.println("*************************************");
		System.out.println("Age: 	" + Katie.getAge());
		System.out.println("Id: 	" + Katie.getId());
		System.out.println("Type: 	" + Katie.getBd().getType());
		System.out.println("Factor: " + Katie.getBd().getFactor());
	}

}
