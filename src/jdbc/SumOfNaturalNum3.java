package jdbc;

public class SumOfNaturalNum3 {
	static int naturalNumberSum(int n)   
	{   
	int sum = 0;     
	for (int i = 1; i <= n; i++)      
	sum = sum + i;   
	return sum;   
	}   
	public static void main(String[] args) {
		// function
		int n = 50;   
		System.out.println("Sum of Natural Numbers is: "+naturalNumberSum(n));  

	}

}
