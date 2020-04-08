// final method cannot be overriden

package Introduction_Java_Programming;

class D{
	
	void fun1() {
		
	}
	
	final void fun2()
	{
		
	}
	
}

class E extends D
{
	void fun1()
	{
		
	}
	
/*								----> final method cannot be overriden in child class
	
	void fun2()
	{
		
	}
	
	*/
	
}

public class Sample33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
