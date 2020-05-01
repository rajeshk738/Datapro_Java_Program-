// ArrayList Demo

package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int idno;
	String na,course;
	double fee;
	
	Student(int n, String na,String c,double f)
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
public class Sample3 {

	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Sai Srinivas","Android",9000.00);
		Student s2 = new Student(22,"Maanas Aashrith",".Net",6500.00);
		
		int n1 = 45;
		int n2 = 78;
		float f = 54.123f;
		String str = "Hello";
		
		ArrayList a1 = new ArrayList();
		a1.add(n1);
		a1.add(n2);
		a1.add(f);
		a1.add(s1);
		a1.add(s2);
		a1.add(str);
		
		System.out.println("The elements are: ");
		
		for(Object obj: a1)
			System.out.println(obj);

	}

}
