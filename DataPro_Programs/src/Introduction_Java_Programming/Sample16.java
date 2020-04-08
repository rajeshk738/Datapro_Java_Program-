// Comparing Objects

package Introduction_Java_Programming;

class Employee{
	int idno;
	String name,designation;
	double salary;
	
	Employee(int n, String na,String deg,double sal)
	{
		idno = n;
		name = na;
		designation = deg;
		salary = sal;
	}
}

public class Sample16 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(11, "manmohan Singh", "PM",100000);
	//	Employee e2 = new Employee(22, "Kiran Kumar ", "CM",50000);  -----> Not Same
		Employee e2 = new Employee(11, "manmohan Singh", "PM",100000);  // -->  Not same
		
		if(e1 == e2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println(e1.toString()); // --> object hashcode address value
		System.out.println(e2.toString()); // ---> object hashcode  address value
		
	}

}
