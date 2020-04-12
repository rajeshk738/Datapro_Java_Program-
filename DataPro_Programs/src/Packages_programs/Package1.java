// importing the classes from another package "myPack1" 

package Packages_programs;
 
//  import myPack1.*;   ----->  this * means that the import statement imports all classes in that particular package

import myPack1.Pack1;
import myPack1.Pack2;


public class Package1 {

	public static void main(String[] args) {

			Pack1 p1 = new Pack1();
			p1.fun1();
			
			Pack2 p2 = new Pack2();
			p2.fun2();
	}

}
