package jdbc;

public class TechNumRange {

	public static void main(String[] args) {
		System.out.println("Tech numbers between 1 to 1000 are: ");      
		for (int i = 1; i <= 1000; i++)   
		{   
		int p1 = i % 2;  
		int p2 = i / 4;  
		int sum = p1 + p2;   
		if (i == (sum * sum))  
		System.out.println(i);  
		}  } }
