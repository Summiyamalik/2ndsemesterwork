package polymorphisum;
class MathUtils {
    public int add(int num1, int num2) {
        return num1 + num2; }
    public double add(double num1, double num2) {
        return num1 + num2; }
    public String add(String str1, String str2) {
        return str1 + str2; } }
public class Polymorphism {
	public static void main(String[] args) {
		MathUtils mathUtils = new MathUtils();
        int result1 = mathUtils.add(5, 10);
        System.out.println("Result (int): " + result1);
        double result2 = mathUtils.add(3.5, 2.5);
        System.out.println("Result (double): " + result2);
        String result3 = mathUtils.add("Hello", " World!");
        System.out.println("Result (String): " + result3);	} }
