package Tasks18122024;


public class GradeCalculation {

	public static void main(String[] args) {
		int percentage = 75;
		
		if (percentage >= 90) {
			System.out.println("Your Scored A Grade");
		} 
		else if (percentage >= 75 && percentage <90 ) {
			System.out.println("Your Scored B Grade");
		} 
		else if (percentage >= 50 && percentage < 75) {
			System.out.println("Your Scored C Grade");
		} 
		else {
			System.out.println("Your Faild Better Luck Next Time");
		}

	}

}
