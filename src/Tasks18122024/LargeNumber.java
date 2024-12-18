package Tasks18122024;

public class LargeNumber {

	public static void main(String[] args) {
		int a = 32;
		int b = 43;
		int c = 143;
		
		if (a > b && a > c) {
			System.out.println(a + " is Large Number");
		} 
		else if (b > a && b > c) {
			System.out.println(b + " is Large Number");
		} 
		else {
			System.out.println(c + " is Large Number");
		}

	}

}
