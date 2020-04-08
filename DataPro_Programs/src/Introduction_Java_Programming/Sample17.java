// Comparing Objects example 2

package Introduction_Java_Programming;

class Employee1{
	int idno;
	String name,designation;
	double salary;
	
	Employee1(int n, String na,String deg,double sal)
	{
		idno = n;
		name = na;
		designation = deg;
		salary = sal;
	}
}

public class Sample17 {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(11, "manmohan Singh", "PM",100000);
	
		Employee1 e2 = new Employee1(11, "manmohan Singh", "PM",100000); 
		
		e2 =e1;
		
		if(e1 == e2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println(e1.toString()); // --> object hashcode address value
		System.out.println(e2.toString()); // ---> object hashcode  address value
		
	}

}

