package jdbc;

public class SmallestNum3 {

	public static void main(String[] args) {
		int x = 110, y = 170, z = 169;  
		if(x<=y)    
		{  
		if(x<=z)  
		System.out.println("The smallest number is: "+x);  
		else    
		System.out.println("The smallest number is: "+z);  
		}   
		else   
		{  
		if(y<=z)  
		System.out.println("The smallest number is: "+y);  
		else  
			System.out.println("The smallest number is: "+z);  
		}
	}

}
