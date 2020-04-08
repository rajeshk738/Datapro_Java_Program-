// Reading an integer from keyboard, also covers importing a class.

package Introduction_Java_Programming;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("The entered number is: "+n);
		
	}

}
