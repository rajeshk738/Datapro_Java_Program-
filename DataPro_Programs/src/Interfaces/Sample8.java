// Using interfaces to hold a list of constants example 1

package Interfaces;

interface ListOfConstants{
	float PI = 3.14f;
	float C = 3e+08f;
	
}

public class Sample8 {								//---> If we do not implement the interface then the variables are 
													//     accessed by interface class Name
	public static void main(String[] args) {
			
		System.out.println(ListOfConstants.PI);        // variables accessed using interface class name
		System.out.println(ListOfConstants.C + " mts/sec");

	}

}
