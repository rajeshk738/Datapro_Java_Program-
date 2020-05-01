// Generics Example3 Compile time error is better than runtime error

package Collections_Framework;

import java.util.ArrayList;

public class Sample22 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("abc");
//		a.add(87);     // Now Compile time error
		a.add("mno");
		
		for(int i=0;i<a.size();i++)
		{
			String str = (String) a.get(i);  
			System.out.println(str);
		}

	}

}
