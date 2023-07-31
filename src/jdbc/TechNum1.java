package jdbc;
import java.util.Scanner;
public class TechNum1 {

	public static void main(String[] args) {
		int count=0;      
		Scanner sc = new Scanner( System.in );  
		System.out.print("Enter the number to check: ");  
		int n=sc.nextInt();   
		while(n>0)  
		{  
		count++;  
		n=n/10;  
		}   
		if(count%2==0)  
		System.out.println("The given number is a tech number.");  
		else  
		System.out.print("The given number is not a tech number.");  

	}

}
