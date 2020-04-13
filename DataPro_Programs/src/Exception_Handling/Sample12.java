// Demo on throwing a predefined exception class object

package Exception_Handling;

public class Sample12 {

	public static void main(String[] args) {
		
		float x =1, y=1000,z;
		
		try {
			
			z=x/y;
			if(z<0.01)
				throw new ArithmeticException("Number is too small");
			
			System.out.println("The result is:"+ z);

		}
		catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
		}
	}

}
