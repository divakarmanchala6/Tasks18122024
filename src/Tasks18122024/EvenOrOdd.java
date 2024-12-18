package Tasks18122024;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Please Enter The Interger: ");
		
		myObj.close();
		int a = myObj.nextInt();
		
		if (a % 2 == 0)  {
			System.out.println(a + " is Even Number");
		} else {
			System.out.println(a + " is Odd Number");
			
		}

	}

}
