// Generics Example2 - ClassCastException - Runtime error

package Collections_Framework;

import java.util.ArrayList;

public class Sample21 {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("abc");
		a.add(87);
		a.add("mno");
		
		for(int i=0;i<3;i++)
		{
			String str = (String) a.get(i);  // we have to convert from Object type to String using Cast
											 // Runtime error --ClassCastException --- cannot convert from Integer to String						
			System.out.println(str);
		}

	}

}
