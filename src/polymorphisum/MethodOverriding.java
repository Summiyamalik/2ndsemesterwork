package polymorphisum;
class MyClass{
	int height;
	MyClass(){
		System.out.println("bricks");
		height=0;
	}
	MyClass(int i){
		System.out.println("Building new house that "
				+ "is"+i+"feet tall");
		height=i;
	}
	void info() {
		System.out.println("house is"+height+"feet tall");
	}
    void info(String s) {
	System.out.println(s+": House is"+height+"feet tall");
}
}
public class MethodOverriding{
	public static void main(String[] args) {
		MyClass t = new MyClass(0);
		t.info();
		t.info("overloaded method");
		new MyClass();
	}
}