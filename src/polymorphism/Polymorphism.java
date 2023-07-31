package polymorphism;
class Bird{
	public void sing() {
		System.out.println("Tweet Tweet Tweet");
	}
}
class Robin extends Bird{
	public void sing() {
		System.out.println("tdaa tdaa tdaa");
	}
}
class Pelican extends Bird{
	public void sing() {
		System.out.println("twik twik twik");
	}}
	public class Polymorphism {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.sing();
		Robin s = new Robin();
		s.sing();
		Pelican f = new Pelican();
		f.sing();
	} }

