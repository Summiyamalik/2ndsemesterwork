package inheritance;

public class Animal {
		    private String name;
		    private int age;
		    private double weight;
		    
		    public Animal(String name, int age, double weight) {
		        this.name = name;
		        this.age = age;
		        this.weight = weight;
		    }
		    
		    public void eat() {
		        System.out.println(name + " is eating.");
		    }
		    
		    public void sleep() {
		        System.out.println(name + " is sleeping.");
		    }
		    
		    public void makeSound() {
		        System.out.println(name + " is making a sound.");
		    }
		 public static void main(String[] args) {
		        Animal lion = new Animal("Leo", 5, 150.5);
		        lion.eat();         
		        lion.sleep();       
		        lion.makeSound();   
		    } }
