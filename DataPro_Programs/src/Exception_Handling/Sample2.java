/* without using exception handling
 * (with problem)
 */


package Exception_Handling;

public class Sample2 {

	public static void main(String[] args) {
		int a = 10, b = 0, c;
		c = a/b;								// problem ---Divide by zero--Arithmetic exception occured
		System.out.println("Quotient: "+c);
		System.out.println("The end");

	}

}

