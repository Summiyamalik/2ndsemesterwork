package polymorphisum;
abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color; }
    public abstract double calculateArea();
    public void displayColor() {
        System.out.println("The color of the shape is: " + color); } }
class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius; }
    //Override
    public double calculateArea() {
        return Math.PI * radius * radius; } }
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width; }  //Override
    public double calculateArea() {
        return length * width; } }
public class Abstract {
	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());
        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); } }
