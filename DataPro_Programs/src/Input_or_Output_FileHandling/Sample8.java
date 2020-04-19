/*  InputMismatchException demo - running sum of a set of integers &
 * reading a character
 * 
 */

package Input_or_Output_FileHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		char ch;
		while(true)
		{
			System.out.println("Enter a no: ");
			try
			{
				sum += scan.nextInt();
			}
			catch(InputMismatchException exp)
			{
				System.out.println("Please enter proper input, the actual message is: "+exp.getMessage());
				scan.nextLine();
			}
			
			System.out.println("Do you wish to continue[y/n]?: ");
			ch = (char)System.in.read();
			if(ch != 'y')
				break;
		}
		
		System.out.println("Sum = "+sum);

	}

}
