package Tasks18122024;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Please Enter The Year: ");
		
		int year = myObj.nextInt();
		
		myObj.close();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}

	}

}
