// Creating array of Objects

package ControlStructures_Arrays_Strings_WrapperClasses;

class Customer{
	
	Customer()
	{
		System.out.println("Constructor");
	}
}

public class Sample17 {

	public static void main(String[] args) {
		
		Customer[] arr = new Customer[5]; //---> creating array of objects but not initialized
	   arr[0] = new Customer();		//	--->  one object is initialized
        arr[1]= new Customer();   
	
/*		Customer c1 = new Customer();       //  ---> calls two times zero arg constructor
		Customer c2 = new Customer();   */
	
	}

}
