package first_project;
import java.util.Scanner;
public class Mathoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      double num1, num2;
	      
	      System.out.print("Enter first number: ");
	      num1 = scanner.nextDouble();
	      System.out.print("Enter second number: ");
	      num2 = scanner.nextDouble();
	      
	      double sum = add(num1, num2);
	      double difference = subtract(num1, num2);
	      double product = multiply(num1, num2);
	      double quotient = divide(num1, num2);
	      double remainder = modulo(num1, num2);
	      
	      System.out.println(num1 + " + " + num2 + " = " + sum);
	      System.out.println(num1 + " - " + num2 + " = " + difference);
	      System.out.println(num1 + " * " + num2 + " = " + product);
	      System.out.println(num1 + " / " + num2 + " = " + quotient);
	      System.out.println(num1 + " % " + num2 + " = " + remainder);
	   }
	   
	   public static double add(double num1, double num2) {
	      return num1 + num2;
	   }
	   
	   public static double subtract(double num1, double num2) {
	      return num1 - num2;
	   }
	   
	   public static double multiply(double num1, double num2) {
	      return num1 * num2;
	   }
	   
	   public static double divide(double num1, double num2) {
	      return num1 / num2;
	   }
	   
	   public static double modulo(double num1, double num2) {
	      return num1 % num2;
	}

}
