// Overloaded constructors

package Introduction_Java_Programming;

class Hello1{
	Hello1()
	{
		System.out.println("Hello-Zero-arg-Constructor");
	}
	
	Hello1(int n)
	{
		System.out.println("Hello-one-arg-Constructor");
	}
}


public class Sample10 {

	public static void main(String[] args) {
		
		new Hello1(89);
	}

}
