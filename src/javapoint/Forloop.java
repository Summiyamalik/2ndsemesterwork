package javapoint;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int number = input.nextInt();
		System.out.println("Enter number 1 to"+ number + ":");
		for(int i=1; i<=number; i++) {
			System.out.println(1+ " ");
		}
		System.out.println();
		System.out.println("Multiplication table for: "+ number + ":");
         for(int i=1; i<=10; i++) {
        	System.out.println(number+"*"+i+"="+(number*i)); 
         }
	}

}
