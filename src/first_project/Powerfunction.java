package first_project;
import java.util.Scanner;
public class Powerfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      double base, exponent;
	      
	      System.out.print("Enter the base number: ");
	      base = scanner.nextDouble();
	      System.out.print("Enter the exponent: ");
	      exponent = scanner.nextDouble();
	      
	      double result = power(base, exponent);
	      System.out.println(base + " raised to the power of " + exponent + " = " + result);
	   }
	   
	   public static double power(double base, double exponent) {
	      if (exponent == 0) {
	         return 1;
	      } else if (exponent > 0) {
	         return base * power(base, exponent - 1);
	      } else {
	         return 1 / power(base, -exponent);
	      }
	}

}
