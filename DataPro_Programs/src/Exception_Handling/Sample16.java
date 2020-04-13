// Demo on PrintStackTrace()

package Exception_Handling;

public class Sample16 {
	
	void fun3()
	{
		int a=10, b=0,c;
		try {
			c = a/b;
			System.out.println("Quotient: "+c);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void fun2()
	{
		fun3();
	}
	
	void fun1()
	{
		
		fun2();
		
	}
	

	public static void main(String[] args) {
		
		Sample16 obj = new Sample16();
		obj.fun1();
		System.out.println("The end");

	}

}
