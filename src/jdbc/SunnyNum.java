package jdbc;
import java.util.Scanner;
public class SunnyNum {
         //N=24,N+1=25,25 is a perfect square it is sunny num.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a number to check: ");   
		int N=sc.nextInt();   
		isSunnyNumber(N);   }          
		static boolean findPerfectSquare(double num)   {    
		double square_root = Math.sqrt(num);   
		return((square_root - Math.floor(square_root)) == 0);   }     
		static void isSunnyNumber(int N)   {    
		if (findPerfectSquare(N + 1))   {   
		System.out.println("The given number is a sunny number.");   }    
		else  {   
		System.out.println("The given number is not a sunny number.");   
		}   } }
