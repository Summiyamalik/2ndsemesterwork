package constructor;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayDetail() {

		System.out.println("name"+ name);
		System.out.println("age"+ age);
	}
	public static void main(String[] args) {
     Person p1 = new Person("Summiya",14);
     p1.displayDetail();
	}

}
