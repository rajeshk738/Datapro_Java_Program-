// What if a field is not initialized?

package Introduction_Java_Programming;

class Hello4{
	int n;
	float i;
	double k;
	String s;
	boolean b;
	void fun()
	{
		System.out.println(n);   // --> prints default value 0 to output when not initialized
		System.out.println(i); 
		System.out.println(k); 
		System.out.println(s); 
		System.out.println(b); 
	}
	
}
public class Sample13 {

	public static void main(String[] args) {
		new Hello4().fun();  

	}

}
