package javapoint;
import java.util.Scanner;
public class Brain {

	public static void main(String[] args) {
		char username, userpassword;
		int result;
		Scanner Login = new Scanner(System.in);
		System.out.println("Enter username");
		username = Login.next().charAt(0);
		System.out.println("Enter password");
		userpassword = Login.next().charAt(0);
		if (username=='m'&&userpassword=='b') {
			System.out.println("Login Successfuly");
		}
		else if (username!='m'&&userpassword=='b') {
			System.out.println("username not found");
		}
		else if (username=='m'&&userpassword!='b') { 
			System.out.println("incorrect password");
		}
		else {
			System.out.println("record does not found");
		}
	}

}
