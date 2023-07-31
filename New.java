package exceptionhandling;
import java.util.Scanner;
import java.util.InputMismatchException;
public class New {

	public static void main(String[] args) {
	try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number to divide: ");
		int X = scanner.nextInt();
		System.out.println("Enter a whole number to divide by: ");
		int Y = scanner.nextInt();
		int Z = X/Y;
		System.out.println("Result: " + Z);
	}catch(ArithmeticException e) {
		System.out.println("can't divided by zero: ");
	}catch(InputMismatchException e) {
		System.out.println("Please enter a number..");
	}
	finally {
		System.out.println("This will always print..");
	}
	}

}
