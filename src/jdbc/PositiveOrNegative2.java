package jdbc;
import java.util.Scanner;
public class PositiveOrNegative2 {

	public static void main(String[] args) {
		double num, result;     
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number you want to check: ");   
		num = sc.nextDouble();  
		//invoking signum() method of the Math class  
		result=Math.signum(num);  
		System.out.print(result);  

	}

}
