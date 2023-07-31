package jdbc;
import java.util.Scanner;
public class SphenicNum {
	public static void main(String[] args) {
		// n=30,30=1,2,3,5 on multiply them 30 is a sphenic num.
		Scanner sc=new Scanner(System.in);  
		int x,num,i,j,a,b,cp,ctr;  
		System.out.print("Enter the lower limit: ");  
		a=sc.nextInt();  
		System.out.print("Enter the upper limit: ");  
		b=sc.nextInt();  
		for(num=a;num<=b;num++)  {  
		int c=0, f=1;  
		cp=num;  
		ctr=0;  
		for (x=2;x<=cp;x++)  {  
		c=0;  
		while((cp%x)==0)  
		{  
		cp=cp/x;  
		c++;  
		}  
		if(c==1)  
		{  
		f=f*x;  
		ctr++;  
		}  
		}  
		if(f==num && ctr==3)  
		System.out.print(num+"\t");   
		}  
		System.out.println(" is a sphenic number:"); } }
