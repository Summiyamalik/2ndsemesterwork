package first_project;
import java.util.Scanner;
public class SumofNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		System.out.println("Enter an integer value: ");
		int number = input.nextInt();
		while(i<=number) {
			sum += i;
			i++;
		}
System.out.println("The sum of all the number from 1 to "+ number + " is " + sum);
	}
}
