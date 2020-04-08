// String VS StringBuffer

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample23 {

	public static void main(String[] args) {
		
		String s1  = new String("Datapro");
		StringBuffer s2 = new StringBuffer("B V Raju");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		s1 = s1.concat("MVP Colony");
		s2.append("MVP Colony");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1);
		System.out.println(s2);
	}

}
