package Tasks18122024;

import java.util.Scanner;

public class NumberTypeIdentifier {
	public static void main(String []args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int a = userInput.nextInt();
		
		userInput.close();
		if (a > 0) {
			System.out.println(a + " is Positive Number");
		} else if (a < 0) {
			System.out.println(a + " is Negative Number");
		} else {
			System.out.println("I am the Special Zero");
		}
		
	}

}
