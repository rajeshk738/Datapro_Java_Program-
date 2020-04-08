// Comparing strings using == operator

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample25 {

	public static void main(String[] args) {
		
		String s1 = "Vizag";
		String s2 = s1;
		String s3 = new String("Vizag");
		String s4 = "Vizag";
		String s5 = s3;
		String s6 = new String("Vizag");
		
		if(s1==s2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		if(s1==s3)
			System.out.println("same");
		else
			System.out.println("not same");
		
		if(s1==s4)
			System.out.println("same");
		else
			System.out.println("not same");
		
		if(s3==s5)
			System.out.println("same");
		else
			System.out.println("not same");
		
		if(s3==s6)
			System.out.println("same");
		else
			System.out.println("not same");
		
		
		if(s1==s5)
			System.out.println("same");
		else
			System.out.println("not same");
		
		
	}

}

