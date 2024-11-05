/* Alex McLaurin 10-24-2024
In class we combined salesperson 1 and 2, so this file serves as both
*/

public class DemoSalesperson {

	public static void main(String[] args) {
		
		Salesperson [] salesPeople = new Salesperson[10];
		int id = 111;
		double sales = 25000;
		
		for(int i = 0; i < salesPeople.length; i ++) {
			salesPeople[i]=  new Salesperson((id + i),(sales + 5000 * i));
			System.out.println(salesPeople[i]);
		}

	}

}
