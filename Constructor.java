package constructor;

public class Constructor {
   int sum=0;
   int x;
   int y;
   public Constructor() {
	   x=22;
	   y=34;
	   sum=x+y;
   }
	public static void main(String[] args) {
		Constructor herry = new Constructor();
		System.out.println("Sum of to num is=");
		System.out.println(herry.sum);

	}

}
