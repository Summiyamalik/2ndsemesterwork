package first_project;
import java.util.Scanner;
public class PositiveNegativeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		if(number > 0) {
			System.out.println(number+ " is positive number ");
		}else if (number < 0) {
			System.out.println(number+ " is negative number ");
		}else {
			System.out.println("The number is zero: ");
	}
	}
}
