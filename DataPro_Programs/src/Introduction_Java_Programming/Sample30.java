// Invoking the base class constructors Ex2

package Introduction_Java_Programming;

class Base5{
	Base5()
	{
		System.out.println("Base-Zero-arg-constructor");
	}
	
	Base5(int n){
		System.out.println("Base-one-arg-constructor");
	}
}

class Der5 extends Base5{
	Der5()
	{
		super();  // ---> calls parent class zero arg constructor
		System.out.println("Der-Zero-arg-constructor");
	}
	
	Der5(int n){
		super(5);  //---> calls parent class one arg constructor
		System.out.println("Der-one-arg-constructor");
	}
}

public class Sample30 {

	public static void main(String[] args) {
		
		new Der5(98);
		new Der5();
		

	}

}
