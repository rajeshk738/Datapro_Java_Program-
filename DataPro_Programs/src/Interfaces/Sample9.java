// interface Example2

package Interfaces;

interface ListOfConstants1{
	float PI = 3.14f;
	float C = 3e+08f;
}


public class Sample9 implements ListOfConstants1{

	public static void main(String[] args) {
		
		System.out.println(PI);					// direct access to variables because class implements the interface class
		System.out.println(C+ " mts/sec");
		
	//	PI = 43;    ---> variables in interface class are by default public static final... error to assign a constant variable.

	}

}
