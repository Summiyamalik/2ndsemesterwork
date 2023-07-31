package first_project;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	      System.out.println("Enter the first number:");
	      double num1 = scanner.nextDouble();

	      System.out.println("Enter the second number:");
	      double num2 = scanner.nextDouble();

	      System.out.println("Enter the operation (+, -, *, /):");
	      char operator = scanner.next().charAt(0);

	      double result;
	      switch(operator) {
	         case '+':
	            result = num1 + num2;
	            break;

	         case '-':
	            result = num1 - num2;
	            break;

	         case '*':
	            result = num1 * num2;
	            break;

	         case '/':
	            result = num1 / num2;
	            break;

	         default:
	            System.out.println("Invalid operator");
	            return;
	      }

	      System.out.println("Result: " + result);
	}

}
