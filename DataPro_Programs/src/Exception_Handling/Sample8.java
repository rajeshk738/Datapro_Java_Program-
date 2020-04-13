// Nested try/catch blocks demo

package Exception_Handling;

public class Sample8 {

	public static void main(String[] args) {

		int sum=0,n;
		try {
			for(int i=0;i<5;i++)
			{
				n = Integer.parseInt(args[i]);
				sum+=n;
			}
			
			try {
				int x[] = new int[5];
				
				for(int i=0; i<8;i++)
					System.out.println(x[i]);
				int a=10, b=0,c;
				c=a/b;
				System.out.println("Quotient: "+c);	
					
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("Inner Catch1: "+ e.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException e)                       // for input == "10 20 30 40 50"  Inner catch2 executed
			{
				System.out.println("Inner Catch2: "+ e.getMessage());
			}
			
			System.out.println("End of inner try/catch ");
		}
		
		catch(NumberFormatException exp)                     //   for input ---" 10 20 rajesh" Outer catch1 is executed
		{
			System.out.println("Outer Catch1: "+ exp.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException exp)           // for input ---" 10 20 30 " Outer catch2 is executed
		{
			System.out.println("Outer Catch2: "+ exp.getMessage());
		}			
		
		catch(Exception exp)								// any other exception
		{
			System.out.println("Outer Catch3: "+ exp.getMessage());
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("End of outer try/catch ");

	}

}
