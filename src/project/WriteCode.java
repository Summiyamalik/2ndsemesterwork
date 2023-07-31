package project;
import java.io.FileWriter;
import java.io.IOException;
public class WriteCode {
	public static void main(String[] args) {
		try {
         FileWriter writer = new FileWriter("C:\\Users\\HP\\Desktop\\summiya.txt", true);
         writer.write("Hello Students");
         writer.write("\r\n");
         writer.write("Today is my presentation");
         writer.write("\n");
         writer.write("My name is Summiya");
         writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} } }



