// To prove that in Java every function is a virtual function

package Interfaces;

class Base
{
	void fun1()
	{
		System.out.println("Base-fun1()");
	}
	
	void fun2()
	{
		System.out.println("Base-fun2()");
	}
}

class Der extends Base
{
	void fun1()
	{
		System.out.println("Der-fun1()");
	}
	void fun2()
	{
		System.out.println("Der-fun2()");
	}
}

public class Sample1 {

	public static void main(String[] args) {
			
		Base bptr;
		Base b = new Base();
		bptr = b;
		bptr.fun1();
		bptr.fun2();
		
		Der d = new Der();
		bptr = d;
		bptr.fun1();
		bptr.fun2();

	}

}
