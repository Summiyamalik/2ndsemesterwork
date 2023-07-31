package first_project;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	      double length, width;
	      
	      System.out.print("Enter the length of the rectangle: ");
	      length = scanner.nextDouble();
	      System.out.print("Enter the width of the rectangle: ");
	      width = scanner.nextDouble();
	      
	      double area = length * width;
	      double perimeter = 2 * (length + width);
	      
	      System.out.println("Area of the rectangle = " + area);
	      System.out.println("Perimeter of the rectangle = " + perimeter);
	   }
	
	}


