// Number format exception demo - without using exception handling

package Exception_Handling;

public class Sample5 {

	public static void main(String[] args) {	// ---> Run configurations---provided command line arguments ---" hi ra rajesh"
											  //---> No error when we provide command line arguments------" 20 10 30 "
		int sum = 0, n;
		
		for(int i =0; i<args.length;i++)
		{
			n = Integer.parseInt(args[i]);           // Number format exception ----cannot convert string to number " hi ra rajesh"
			sum = sum + n;							// command line arguments string---"10 20 30" accepted and no exception occur
		}
		
		System.out.println("Sum = "+ sum);

	}

}
