package first_project;

public class Logicaloperatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
	      boolean b = false;
	      
	      // Logical AND operator
	      if (a && b) {
	         System.out.println("Both a and b are true");
	      } else {
	         System.out.println("Either a or b is false");
	      }
	      
	      // Logical OR operator
	      if (a || b) {
	         System.out.println("Either a or b is true");
	      } else {
	         System.out.println("Neither a nor b is true");
	      }
	      
	      // Logical NOT operator
	      if (!a) {
	         System.out.println("a is false");
	      } else {
	         System.out.println("a is true");
	      }
	}

}
