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
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(str);
			System.out.println(emp);
			
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
