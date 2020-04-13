// finally Example 3

package Exception_Handling;

public class Sample11 {
	
public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		catch(Exception e) {
			System.out.println("Runtime error: "+e.getMessage());
			
			return;    // ---> when there is a return statement in try, catch
		}			//         it first goes to finally block to execute the code and comes back to try/catch return statement
		
		finally
		{
		 System.out.println("I am in finally block");  // ---> If finally block has return statement 
		}											   //      then it overrides the try, catch return statements
													// that means it doesn't execute the return statements in try/catch
		System.out.println("The end");

	}

}
