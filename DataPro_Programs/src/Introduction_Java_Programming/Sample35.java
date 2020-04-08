// upcasting and downcasting

package Introduction_Java_Programming;

class Base6{
	
}

class Der6 extends Base6{
	
}

public class Sample35 {

	public static void main(String[] args) {

		Base6 b = new Base6();
		
		Der6 d = new Der6();
		
		// b = d; // upcasting is OK
		// d = b; // downcasting is NOT OK
		 d = (Der6) b;  // downcasting is OK via typecasting
	}

}
