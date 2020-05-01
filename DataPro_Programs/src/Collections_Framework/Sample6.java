// Vector Example 3

package Collections_Framework;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

class Student1{
	int idno;
	String na,course;
	double fee;
	
	Student1(int n, String na,String c,double f)
	{
		idno = n;
		this.na = na;
		course = c;
		fee = f;
	}
	
	public String toString() {
		return(idno+", "+na+", "+course+", "+fee);
	}
}

public class Sample6 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		int i;
		Student1 s1 = new Student1(11,"Satya Nandi","C",2500.00);
		Student1 s2 = new Student1(22,"Sai Karthikeya","C++",2000.00);
		
		int n1 = 45;
		int n2 = 78;
		float f = 54.123f;
		String str = "Hello";
		v.addElement(n1);
		v.addElement(n2);
		v.addElement(f);
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(str);
		System.out.println("Method1: The elements are: ");
		
		for(i=0;i<v.size();i++)
			System.out.println(v.elementAt(i));
		
		Iterator itr = v.iterator();
		System.out.println("\nMethod2: The elements are: ");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("\nMethod3: The elements are: ");
		for(Object obj: v)
			System.out.println(obj);
		
		Enumeration e = v.elements();
		System.out.println("\nMethod4: The elements are: ");
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

	}

}
