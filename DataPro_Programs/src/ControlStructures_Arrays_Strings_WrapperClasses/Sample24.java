// StringBuffer Functions

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample24 {

	public static void main(String[] args) {
		
		StringBuffer s1  = new StringBuffer("Hindustan");
		StringBuffer s2 =  new StringBuffer("Hindustan");
		StringBuffer s3 = new StringBuffer("Hindustan");
		
		System.out.println(s1.reverse());
		System.out.println(s2.delete(2,5));
		System.out.println(s3.insert(2, "vizag"));

	}

}
