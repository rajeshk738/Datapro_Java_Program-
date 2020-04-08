// Assigning arrays

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample14 {

	public static void main(String[] args) {
		
		int a[] = {10,12,654,89,91};
		int b[] = new int[3];
		
		b = a;				// ----> copy the address of a, Now both a and b point to same memory location
		for(int i=0; i<b.length;i++)
		System.out.println(b[i]);
		
	/*	b[0] = 555;		----> if change the value of b it will effect a because they pointing same address
		
		System.out.println(a[0]);
		
		*/ 
		

	}

}
