/* 
 * Generics makes Collections type safe by ensuring that same type of elements are added to a Collection
 * 
 * Generics Example program
 */

// ArrayList Demo

package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

class Student4{
	int idno;
	String na,course;
	double fee;
	
	Student4(int n, String na,String c,double f)
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
public class Sample20 {

	public static void main(String[] args) {
		
		Student4 s1 = new Student4(11,"Sai Srinivas","Android",9000.00);
		Student4 s2 = new Student4(22,"Maanas Aashrith",".Net",6500.00);
		
	
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("one");
		a1.add("two");
//		a1.add(54.123f);		// cannot accept the float value
//		a1.add(s1);       // cannot accept the arguments of Student4
//		a1.add(s2);		  // cannot accept the arguments of Student4
		a1.add("Hello"); 
		a1.add("Bye");
		
		System.out.println("The elements are: ");
		
		for(String s: a1)
			System.out.println(s);

	}

}
