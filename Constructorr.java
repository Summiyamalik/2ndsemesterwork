package constructor;
import java.util.Scanner;
public class Constructorr {
    int id;
    int age;
    String name;
    public Constructorr(int a, int b, String n) {
    	id=a;
    	age=b;
    	name=n;
    	
    }
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      Constructorr herry = new Constructorr(123 , 16 , "Summiya");
      System.out.println(herry.id);
      System.out.println(herry.age);
      System.out.println(herry.name);
	}

}
