package polymorphisum;
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name; }
    public void makeSound() {
        System.out.println("The animal makes a sound."); } }
class Dog extends Animal {
    public Dog(String name) {
        super(name); }
    //Override
    public void makeSound() {
        System.out.println("The dog barks."); } }
class Cat extends Animal {
    public Cat(String name) {
        super(name); }
    //Override
    public void makeSound() {
        System.out.println("The cat meows."); } }
public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Dog("Buddy");
        Animal animal2 = new Cat("Whiskers");
        animal1.makeSound();
        animal2.makeSound(); } }
