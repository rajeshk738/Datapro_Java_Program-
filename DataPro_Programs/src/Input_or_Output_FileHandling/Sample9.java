/*
 * Example2 : Running sum of a set of integers , another way of infinite loop, usage of Ctrl+Z (or) F6 as end-of-input ,
 * hasNext() of Scanner
 */

package Input_or_Output_FileHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter a no: ");
		while(scan.hasNext())
		{
			
			try
			{
				sum += scan.nextInt();
			}
			
			catch(InputMismatchException exp)
			{
				System.out.println("Please enter proper input, the actual message is: "+exp.getMessage());
				scan.nextLine();
			}
			
			System.out.println("Enter a no: ");

		}
		
		System.out.println("Sum = "+sum);

	}

}
