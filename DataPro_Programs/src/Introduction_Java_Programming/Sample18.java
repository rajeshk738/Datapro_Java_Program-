// Printing Objects hashcode

package Introduction_Java_Programming;

class Employee2{
	int idno;
	String name,designation;
	double salary;
	
	Employee2(int n, String na,String deg,double sal)
	{
		idno = n;
		name = na;
		designation = deg;
		salary = sal;
	}
}

public class Sample18 {

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2(11, "manmohan Singh", "PM",100000);
	
		Employee2 e2 = new Employee2(22, "Ram", "PK",100000); 
		
		Employee2 e3;
		
		e3 =e1;
		
	
		
		System.out.println(System.identityHashCode(e1)); // ---> object hash code value
		System.out.println(System.identityHashCode(e2)); // --> object hashcode address value
		System.out.println(System.identityHashCode(e3)); // ---> object hashcode  address value
		
	}

}

