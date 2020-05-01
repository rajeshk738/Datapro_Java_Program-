// Vector Example 2

package Collections_Framework;

import java.util.Vector;

public class Sample5 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		int i;
		
		for(i=0;i<args.length;i++)
			v.addElement(args[i]);
		System.out.println("The elements are: ");
		
		for(i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		
		v.setElementAt("Chaitanya", 2);
		System.out.println("The elements are: ");
		
		for(i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		
		v.removeAllElements();
		System.out.println("The elements are: ");
		
		for(i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		
		
	}

}
