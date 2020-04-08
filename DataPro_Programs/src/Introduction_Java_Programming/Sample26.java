// usage of "super" keyword

package Introduction_Java_Programming;

class Base1{
	
	void fun()
	{
		System.out.println("Base-fun");
	}
}

class Der1 extends Base1
{
	void fun()
	{
		super.fun();  // ---> calls parent class method
		System.out.println("Der-fun");
		super.fun();
	}
}

public class Sample26 {
	public static void main(String[] args) {
	
		Der1 d = new Der1();
		d.fun();
	}

}
