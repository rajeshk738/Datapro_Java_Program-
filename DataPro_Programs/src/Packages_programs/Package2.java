/* 
 * If there are two different packages-myPack1, myPack2 have same class name - Hello,
 * the following code demonstrates how to use both the hello classes.
 */

package Packages_programs;

public class Package2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myPack1.Hello h1 = new myPack1.Hello();			//---> fully qualified class name	(package name followed by class name)
		h1.fun();
		
		myPack1.Hello h2 = new myPack1.Hello();    //-----> Note: Here, import statements would work, because, how can Java know which
		h2.fun();									// package's Hello class we are referring to

	}

}
