// Few more functions of Integer class

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample32 {

	public static void main(String[] args) {
		
		int n =5869;
		String str1 = Integer.toBinaryString(n);
		String str2 = Integer.toHexString(n);
		String str3 = Integer.toOctalString(n);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}
	

}
