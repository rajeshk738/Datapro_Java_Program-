// Breaking a string into pieces

package ControlStructures_Arrays_Strings_WrapperClasses;

import java.util.StringTokenizer;

public class Sample21 {

	public static void main(String[] args) {
		
		String str = "Charles Babbage,Dennis Ritchie,Bjarne Stroustrup,James Gosling";
		
/*		String[] arr = str.split(",");     // ----> another way to split the string into tokens
		
		for(String x: arr)
			System.out.println(x);
		
*/		
		StringTokenizer tok = new StringTokenizer(str,",");
		
		
//		StringTokenizer tok = new StringTokenizer(str,",",true);  // ---> prints with commas
		
		System.out.println("The tokens: ");
		
		while(tok.hasMoreTokens())
			System.out.println(tok.nextToken());

	}

}
