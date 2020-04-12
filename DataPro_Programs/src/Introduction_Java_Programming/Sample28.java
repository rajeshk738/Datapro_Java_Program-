// one more rule regarding function overriding.

package Introduction_Java_Programming;

class Bus
{
	
}

class Animal{
	
}

class Lion extends Animal{
	
}

class Base3{
	
	Animal fun()
	{
		System.out.println("Base-fun");
		return new Animal();
	}
	
	
}

class Der3 extends Base3
{
	Lion fun()
	{
		super.fun();
		System.out.println("Der-fun");
		return new Lion();
	}
}

public class Sample28 {
	public static void main(String[] args) {
		
		Der3 d= new Der3();
		d.fun();
		
		
	}

}
