// Labeled break example 2

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample8 {

	public static void main(String[] args) {

		BLOCK1:
		{
			System.out.println("Inside BLOCK1");
	
		
			BLOCK2:
			{
			System.out.println("Inside BLOCK2");
			
			BLOCK3:
			{
				if(true)
					break BLOCK2;
				System.out.println("Inside BLOCK3");
			}
			System.out.println("Outside BLOCK3");
			}
		
			System.out.println("Outside BLOCK2");
			
		}
	System.out.println("Outside BLOCK1");
	}

}
