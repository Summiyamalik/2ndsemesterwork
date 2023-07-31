package jdbc;
import java.util.Scanner;
public class PositiveOrNegative3 {

	public static void main(String[] args) {
		int num, result;   
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number you want to check: ");    
		num = sc.nextInt();  
		//invoking signum() method of the Integer class  
		result=Integer.signum(num);  
		System.out.print(result);  

	}

}
