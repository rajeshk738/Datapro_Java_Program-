//Invoking the base class constructor ex1

package Introduction_Java_Programming;

class Base4{
	Base4()
	{
		System.out.println("Base-constructor");
	}
}

class Der4 extends Base4{
	Der4()
	{
		super();  // ---> calls parent class constructor and super() should be first statement.
		System.out.println("Der- Constructor");
//		super();   ---> constructor call must be in the first statement.
	}
}

public class Sample29 {

	public static void main(String[] args) {
		
		
		new Der4();

	}

}
