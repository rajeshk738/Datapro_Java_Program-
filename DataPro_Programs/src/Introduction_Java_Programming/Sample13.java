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
		System.out.println(n);   // --> prints default value   0   	to output when not initialized
		System.out.println(i);   // --> prints default value   0.0   	to output when not initialized
		System.out.println(k);  // --> prints default value	   0.0   	to output when not initialized
		System.out.println(s);  // --> prints default value    null		 to output when not initialized
		System.out.println(b);  // --> prints default value    false			 to output when not initialized
	}
	
}
public class Sample13 {

	public static void main(String[] args) {
		new Hello4().fun();  

	}

}
