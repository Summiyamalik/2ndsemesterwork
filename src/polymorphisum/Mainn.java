package polymorphisum;
interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    //Override
    public void start() {
        System.out.println("The car starts."); }
    //Override
    public void stop() {
        System.out.println("The car stops."); } }
class Bike implements Vehicle {
    //Override
    public void start() {
        System.out.println("The bike starts."); }
    //Override
    public void stop() {
        System.out.println("The bike stops."); } }
public class Mainn {
	public static void main(String[] args) {
		Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop(); } }
