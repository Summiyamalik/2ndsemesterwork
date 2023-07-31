package first_project;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args) {
		 Random random = new Random();
	 int number = random.nextInt(100) + 1;
     Scanner input = new Scanner(System.in);
	 System.out.print("Guess a number between 1 and 100: ");
int guess = input.nextInt();
while (guess != number) {
 if (guess < number) {
  System.out.println("Too low, try again!");
	 } else {
	 System.out.println("Too high, try again!");
	   }
 System.out.print("Guess a number between 1 and 100: ");
 guess = input.nextInt();
}  
System.out.println("Congratulations, you guessed the number correctly!");
	    }
	}
