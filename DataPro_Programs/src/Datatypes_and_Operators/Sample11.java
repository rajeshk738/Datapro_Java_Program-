// Concatenation operator revisted

package Datatypes_and_Operators;

public class Sample11 {

	public static void main(String[] args) {
		
		int n1 = 10, n2 = 20;
		String s1 = "Hello", s2 = "30";
		float f = 46.25f;
		System.out.println(n1+n2);
		System.out.println(n1+s1);
		System.out.println(n1+s2);
		System.out.println(n1+f);
		System.out.println(s1+n1+n2); // --left to right
		System.out.println(s1+(n1+n2));
		

	}

}
