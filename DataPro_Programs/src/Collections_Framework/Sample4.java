// Vector Example1

package Collections_Framework;

import java.util.Vector;

public class Sample4 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		for(int i=0;i<args.length;i++)
			v.addElement(args[i]);
		
		System.out.println("The elements are: ");
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		
		String[] str = new String[v.size()];
		v.copyInto(str);
		

		System.out.println("The elements are: ");
		
		for(String x: str)
			System.out.println(x);
		
		//------------------------------------------------
		System.out.println("First element: "+v.firstElement());
		System.out.println("Last element: "+v.lastElement());
		System.out.println("is empty: "+v.isEmpty());
		v.removeElementAt(2);
		v.removeElement("ANITS");
		v.insertElementAt("Pydah", 2);
		System.out.println("The elements are: ");
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));

	}

}

