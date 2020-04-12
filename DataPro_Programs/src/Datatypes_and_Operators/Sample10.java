// default values of different types of values

package Datatypes_and_Operators;

class Employee{
	
}
public class Sample10 {
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		String str;
		Employee emp;
		
		void fun()
		{
			System.out.println(a);  	 // ---> default value 0
			System.out.println(b);		// ---> default value 0
			System.out.println(c);		// ---> default value 0
			System.out.println(d);		// ---> default value 0
			System.out.println(e);		// ---> default value 0.0
			System.out.println(f);		// ---> default value 0.0
			System.out.println(g);		// ---> default value ' '
			System.out.println(str);	// ---> default value null
			System.out.println(emp);	// ---> default value null
			
			if(emp == null)
				System.out.println("not pointing to any object");
			else
				System.out.println("Pointing to some objet");
			
			emp = new Employee();
			
			if(emp == null)
				System.out.println("not pointing to any object");
			else
				System.out.println("Pointing to some object");
			
		}
		
		
		public static void main(String[] args) {
			
			new Sample10().fun();
		}

}
