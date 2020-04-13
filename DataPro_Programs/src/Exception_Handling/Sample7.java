// Demo on Multiple catch blocks

package Exception_Handling;

public class Sample7 {

	public static void main(String[] args) {
       int sum = 0 , n;
		
			try {
				
				for(int i=0; i<5;i++)
				{
				n = Integer.parseInt(args[i]);
				sum+= n;
				}
			  }
			
			catch(NumberFormatException exp)                     // Exception  for input ---" 10 20 rajesh "
			{
				System.out.println("Catch1: "+ exp.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException exp)           // Exception for input ------" 10 20"
			{
				System.out.println("Catch2: "+ exp.getMessage());
			}			
			
			catch(Exception exp)								// any other exception
			{
				System.out.println("Catch3: "+ exp.getMessage());
			}
			
			
		System.out.println("Sum  = "+sum);

	}

}
