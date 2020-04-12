//Sum of two integers

package Introduction_Java_Programming;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("Enter two numbers: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = a+b;
		System.out.println("Sum is: "+c);
		System.out.println("Sum of "+a+" and "+b+" = "+c);
	//	System.out.println("Sum of %d and %d =%d",a,b,c); --> not applicable
		

	}

}
