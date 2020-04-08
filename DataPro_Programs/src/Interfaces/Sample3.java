// Demo on Runtime Polymorphism

package Interfaces;

interface Shape{ 
	 void draw();   // By default methods in interface class are public.
}

class Rectangle implements Shape{
	public void draw()                     // ---> we should use the public access specifer bec interface methods are public by default
	{									   //  you should not reduce the access specifier.
		System.out.println("Rectangle");
	}
}

class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}

class Square implements Shape{
	public void draw()
	{
		System.out.println("Square");
	}
}

public class Sample3 {

	public static void main(String[] args) {
		
		Shape bptr;                                 // ----> interface class cannot be instantiated.
		bptr = new Rectangle(); //upcasting
		bptr.draw();
		bptr = new Circle(); // upcasting
		bptr.draw();
		bptr = new Square(); // upcasting
		bptr.draw();

	}

}
