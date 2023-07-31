package javapoint;
import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int number = input.nextInt();
		int factorial = 1;
		int i = 1;
		while(i<=number) {
			factorial *= i;
			i++;
		}
System.out.println("Factorial of "+ number +" is "+ factorial);
	}
}
