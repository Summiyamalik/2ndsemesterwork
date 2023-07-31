package javapoint;
import java.util.Scanner;
public class Newcode {

	public static void main(String[] args) {
	 Scanner T = new Scanner(System.in);
	 int i,j,rows;
	 System.out.println("Enter the num of rows:");
	  rows = T.nextInt();
	 for(i=0;i<rows;i++) {
		 for(j=rows-i;j>1;j--) {
			 System.out.printf(" ");
		 }
		 for(j=0;j<=i;j++) {
			 
			 System.out.printf("* ");
		 }
		 System.out.println();
	 }

	}

}
