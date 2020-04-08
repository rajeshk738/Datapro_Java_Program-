/* TO prove that primitives are passed by value an
 * reference types are passed by reference
 */


package Introduction_Java_Programming;

class Student3 {
	int idno;
	String name,course;
	double fee;
	Student3(int idno,String name,String course,double fee)
	{
		this.idno = idno;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	
	void print()
	{
		System.out.println(idno+","+name+","+course+","+fee);
	}
}


public class Sample14 {

	void fun(int p, Student3 q)
	{
		p =  98;
		q.idno = 22;
		q.name = "Suresh Raina";
		q.course = "Adv Java";
		q.fee = 3500;
	}
	public static void main(String[] args) {
		
		int n=57;
		Student3 s = new Student3(11,"Rohit Sharma",".Net",6500);
		System.out.println("Before: ");
		System.out.println(n);
		s.print();
		Sample14 obj = new Sample14();
		obj.fun(n, s);
		System.out.println("After: ");
		System.out.println(n);
		s.print();
		

	}

}
