package jdbc;
import java.util.Scanner;
public class PositiveOrNegative4 {

	public static void main(String[] args) {
		int num, result;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number you want to check: ");   
		num = sc.nextInt();    
		String[] result1 = {"Positive", "Negative"};    
		System.out.println(result1 [(num >> 31) & 1]);  

	}

}
