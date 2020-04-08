// Demo on implementing an interface

package Interfaces;

interface A{
	void fun1() ;
}

class B implements A{
	
	public void fun1()
	{
		System.out.println("B-fun");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.fun1();

	}

}
