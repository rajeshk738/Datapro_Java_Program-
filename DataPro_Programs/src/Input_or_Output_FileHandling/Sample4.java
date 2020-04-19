/* Round-3  Input from keywords in different ways
 * 
 * Using Scanner class
 * 
 */

package Input_or_Output_FileHandling;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
	int a,b,c;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two no's ");
	a =scan.nextInt();
	b =scan.nextInt();
	c= a+b;
	System.out.printf("Sum = %d",c);

	}

}
