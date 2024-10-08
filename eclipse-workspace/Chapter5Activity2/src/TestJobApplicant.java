//Alex McLaurin 10-1-2024

public class TestJobApplicant {

	public static void main(String[] args) {
		
		//our candidates
		JobApplicant one = new JobApplicant("Alex", "123-4567", true, true, true, true);
		JobApplicant two = new JobApplicant("Katie", "555-4444", false, false, false, false);
		JobApplicant three = new JobApplicant("Amber", "987-6543", true, false, true, true);
		JobApplicant four = new JobApplicant("Ralouca", "867-5309", true, false, true, false);
		
		if(IsQualified(one)) {
			System.out.println(one.getName()+ " is qualified for an interview.");
		}
		else {
			System.out.println(one.getName()+ " is NOT qualified for an interview.");
		}
		if(IsQualified(two)) {
			System.out.println(two.getName()+ " is qualified for an interview.");
		}
		else {
			System.out.println(two.getName()+ " is NOT qualified for an interview.");
		}
		if(IsQualified(three)) {
			System.out.println(three.getName()+ " is qualified for an interview.");
		}
		else {
			System.out.println(three.getName()+ " is NOT qualified for an interview.");
		}
		if(IsQualified(four)) {
			System.out.println(four.getName()+ " is qualified for an interview.");
		}
		else {
			System.out.println(four.getName()+ " is NOT qualified for an interview.");
		}
	}
	
	//the check to see if they're valid candidates
	public static boolean IsQualified(JobApplicant any) {
		int counter = 0;
		if(any.isWord())
			counter++;
		if(any.isExcel())
			counter++;
		if(any.isAccess())
			counter++;
		if(any.isGraphics())
			counter++;
		if(counter >= 3)
			return true;
		return false;
	
		
	}

}
