// Demo on throwing a user defined Exception class object

package Exception_Handling;

class MyException extends Exception{
	
	MyException(String msg)
	{
		super(msg);
	}
}


public class Sample13 {

	public static void main(String[] args) {
		
		float x =1, y=1000,z;
		
		try {
			
			z=x/y;
			if(z<0.01)
				throw new MyException("Number is too small");
			
			System.out.println("The result is:"+ z);

		}
		catch(MyException e)
		{
		System.out.println(e.getMessage());
		}
	}

}