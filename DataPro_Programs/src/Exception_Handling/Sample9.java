// finally block execution

package Exception_Handling;

public class Sample9 {
	
public static void main(String[] args) {
		
		int a = 10, b = 2, c;               // If b is zero --finally block is executed---and runtime exception is occured.
		
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		
		
		finally
		{
			System.out.println("I am finally block");
		}
		System.out.println("The end");

	}

}
