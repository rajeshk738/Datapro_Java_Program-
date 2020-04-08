// To demonstrate that a class can extend one class and at the same time implement any no of interfaces

package Interfaces;

interface A3{
	
}
interface B3{
	void fun5();
	
}
class C3{
	void fun3()
	{
		System.out.println("C-fun3");
	}
	
}

class D3 extends C3 implements A3,B3{
	public void fun1()
	{
		System.out.println("D-fun1");
	}
	
	public void fun2()
	{
		System.out.println("D-fun2");
	}
	
	void fun4()
	{
		System.out.println("D-fun4");
	}
	
	public void fun5()
	{
		System.out.println("B-interface method implemented");
	}
	
	
}

public class Sample5 {

	public static void main(String[] args) {
		
		D3 d =new D3();
		d.fun1();
		d.fun2();
		d.fun3();
		d.fun4();
		d.fun5();
	}

}
