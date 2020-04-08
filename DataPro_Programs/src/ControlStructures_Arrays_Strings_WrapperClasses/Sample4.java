// A point to remember in loop condiditons

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample4 {

	public static void main(String[] args) {
		
		int n = 3569, r, rev=0;
		
		while(n!=0)
		{
			r = n%10;
			rev = rev*10 + r;
			n = n/10;
		}
		
		System.out.println("Reverse: "+rev);
		
	}

}
