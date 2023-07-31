package jdbc;
import java.util.Scanner;
public class BuzzNum {

	public static void main(String[] args) {
		// is divisible by 7 or num end with 7 is a buzz num.
		 int range;  
	        Scanner sc=new Scanner(System.in);  
	        System.out.println("Enter the value of range");  
	        range = sc.nextInt();  
	        for(int i = 1; i <= range; i++)  
	          checkNumber(i);  
	    }  
	    static void checkNumber(int number)   
	    {   
	        if(number % 10 == 7 || number % 7 == 0)  
	        System.out.println(number + " is an Buzz number");  
	}

}
