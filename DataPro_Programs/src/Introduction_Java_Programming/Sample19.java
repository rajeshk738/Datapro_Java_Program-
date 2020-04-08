// another usage of "this" reference.

package Introduction_Java_Programming;

class Batch{
	int ns;
	String course;
	Batch(int ns, String course)
	{
		this.ns = ns;
		this.course = course;
	}
	
	Batch()
	{
		// ns =60;
		// course ="c";
		this(60,"c");
	}
	
	Batch(int ns)
	{
		// this.ns=ns;
		// course = "C++";
		this(ns,"C++");
	}
	
	Batch(String course)
	{
	//	ns=45;
	//	this.course = course;
		this(45, course);
	}
	
	void print()
	{
		System.out.println(ns+ ","+course);
	}
	
}

public class Sample19 {

	public static void main(String[] args) {
		Batch b1 = new Batch(30, "Android");
		b1.print();
		Batch b2 = new Batch();
		b2.print();
		Batch b3 = new Batch(70);
		b3.print();
		Batch b4 = new Batch("JSE");
		b4.print();
		
	}

}
