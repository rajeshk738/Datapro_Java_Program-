// finally block execution

package Exception_Handling;

public class Sample9 {
	
public static void main(String[] args) {
		
		int a = 10, b = 2, c;               
		
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		
		
		finally											// finally block is executed irrespective of exception raised or not
														// finally block is used mostly because of network or database connection close
																//  if program failed or success.
		{
			System.out.println("I am finally block");
		}
		System.out.println("The end");

	}

}
