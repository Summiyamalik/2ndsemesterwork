package first_project;
import java.util.Scanner;

public class Calculators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      double num1, num2;
	      char operator;
	      
	      System.out.print("Enter first number: ");
	      num1 = scanner.nextDouble();
	      System.out.print("Enter second number: ");
	      num2 = scanner.nextDouble();
	      System.out.print("Enter an operator (+, -, *, /): ");
	      operator = scanner.next().charAt(0);
	      
	      double result = calculate(num1, num2, operator);
	      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	   }
	   
	   public static double calculate(double num1, double num2, char operator) {
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
	            return 0;
	      }
	      
	      return result;
	}

}
