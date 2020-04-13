// using exception handling (with problem)

package Exception_Handling;

public class Sample4 {

	public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		catch(Exception e) {
			System.out.println("Runtime error: "+e.getMessage());
		}
		
		System.out.println("The end");

	}

}
