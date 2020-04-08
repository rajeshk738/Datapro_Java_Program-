// creating and using our own static functions.

package Introduction_Java_Programming;

class MyArithmeticOperations
{
	static int sum(int a, int b) {
		return (a+b);
	}
	
	static int product(int a,int b) {
		return (a*b);
	}
	
	
}

public class Sample24 {

	public static void main(String[] args) {
		
		System.out.println(MyArithmeticOperations.sum(10, 20));
		System.out.println(MyArithmeticOperations.product(10, 20));

	}

}
