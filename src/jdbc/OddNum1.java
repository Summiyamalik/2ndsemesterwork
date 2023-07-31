package jdbc;

public class OddNum1 {
	private static void displayOddNumbers(int number, int end)   
	{   
	if(number>end)   
	return;   
	if(number%2!=0)   
	{   
	//prints the odd numbers  
	System.out.print(number +" ");   
	displayOddNumbers(number + 2, end);   
	}   
	else   
	{     
	displayOddNumbers(number + 1, end);   
	}   
	}
	public static void main(String[] args) {
		// Nested if
		System.out.println("List of odd numbers: ");       
		//method calling  
		displayOddNumbers(1, 20);   
	}

}
