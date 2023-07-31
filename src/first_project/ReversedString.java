package first_project;
import java.util.Scanner;
public class ReversedString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("The reversed string is: " + reversedStr);
	}
}
