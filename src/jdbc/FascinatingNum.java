package jdbc;
import java.util.Scanner;
public class FascinatingNum {
	public static void main(String[] args) {
		//n=327,327*2,327*3,327+654+981=327654981 is fascinating num.
		//all num is included 1 to 9.
		int num, n2, n3;      
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter any Number: ");  
		num = sc.nextInt();  
		n2 = num * 2;  
		n3 = num * 3;    
		String concatenatinstring = num + "" + n2 + n3;  
		boolean found = true;   
		for(char c = '1'; c <= '9'; c++)  {  
		int count = 0;   
		for(int i = 0; i < concatenatinstring.length(); i++)  {  
		char ch = concatenatinstring.charAt(i);   
		if(ch == c)   
		count++;  }  
		if(count > 1 || count == 0)  {  
		found = false;  
		break;  }  }  
		if(found)  
		System.out.println(num + " is a fascinating number.");  
		else  
		System.out.println(num + " is not a fascinating number.");  } }
