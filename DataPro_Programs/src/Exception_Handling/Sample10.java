// both catch and finally block

package Exception_Handling;

public class Sample10 {
	
public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		catch(Exception e) {
			System.out.println("Runtime error: "+e.getMessage());
		}
		
		finally
		{
			System.out.println("I am finally block");
		}
		System.out.println("The end");

	}

}
