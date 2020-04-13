// using exception handling

package Exception_Handling;

public class Sample6 {

	public static void main(String[] args) {   // Run configurations---Cmd arguments----" 10 20  hi rajesh 30"
		int sum = 0 , n;
		
		for(int i=0; i<args.length;i++)
		{
			try {
				n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			
			catch(Exception exp)
			{
				System.out.println("Runtime error: "+ exp.getMessage());
				System.out.println(args[i]+" is not a valid integer value");
			}
			
		}
		
		System.out.println("Sum  = "+sum);

	}

}
