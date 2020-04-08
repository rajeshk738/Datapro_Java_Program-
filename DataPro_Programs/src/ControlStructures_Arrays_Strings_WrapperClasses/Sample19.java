/*String mehtods example 2
 * 
 * trim()
 * indexOf()
 * startsWith()
 * endsWith()
 * charAt()
 */

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample19 {

	public static void main(String[] args) {
		
		String s1 = "		Father of		Java is			James Gosling";
		String s2 ;
		String s3 = "Every dark cloud has silver linking";
		
		s2  = s1.trim();
		
		System.out.println(s1+",");
		System.out.println(s2+",");
		int n1 = s3.indexOf('a');
		int n2 = s3.indexOf('a', 10);
		int n3 = s3.indexOf("silver");
		System.out.println(n1+","+n2+","+n3);
		System.out.println(s3.startsWith("Every"));
		System.out.println(s3.endsWith("linking"));
		System.out.println(s3.charAt(2));
		

	}

}
