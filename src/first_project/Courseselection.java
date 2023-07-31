package first_project;
import java.util.Scanner;
public class Courseselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter your grade in FOP (0-100): ");
	        int grade = input.nextInt();
	        
	        if (grade >= 50) {
	            System.out.println("Congratulations, you passed FOP! Proceed to OOP.");
	        } else {
	            System.out.println("Sorry, you did not pass FOP. Please retake the course.");
	        }

	}

}
