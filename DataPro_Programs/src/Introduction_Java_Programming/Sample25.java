// extends keyword INHERITANCE CONCEPTS STARTED

package Introduction_Java_Programming;

class Base{
	
	void fun1() {
		System.out.println("Base-fun1");
	}
}

class Der extends Base{
	
	void fun2()
	{
		System.out.println("Der-fun2");
	}
}

public class Sample25 {

	public static void main(String[] args) {
		
		Der d = new Der();
		d.fun1();
		d.fun2();
		
		
	}

}
