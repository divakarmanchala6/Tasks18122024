package Tasks18122024;

public class SimpleCalculator {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 5;
		String operator1 = "+";
		
		
		switch (operator1) {
			case "+" :
				System.out.println(num1 + num2);
				break;
			case "-" :
				System.out.println(num1 - num2);
				break;
				
			case "*" :
				System.out.println(num1 * num2);
				break;
				
			case "/" :
				System.out.println(num1 / num2);
				break;
				
			default : 
				System.out.println("Please Enter the Valid Operands and Operators");
		}
		

	}

}
