/* String methods example 1
 *
 * length()
 * concat()
 * toUpperCase()
 * toLowerCase()
 * equals()
 * equalsIgnoreCase()
 * substring()
 * replace()
 * 
 */

package ControlStructures_Arrays_Strings_WrapperClasses;

public class Sample18 {

	public static void main(String[] args) {
		String s1 = "India", s2 =  "Bharat", s3;
		String s4 = "MVPColony", s5, s6;
		String s7 = "Vizag", s8 = "VIZAG";
		String s9 = "Vizag is the City of Destiny", s10, s11, s12;
		
		System.out.println(s1.length());
	    s3 = s1.concat(s2).concat("rajesh");		// s3 = s1 + s2 + "rajesh";
		System.out.println("After Concatenation: "+s3);
		
		s5 = s4.toUpperCase();
		s6 = s4.toLowerCase();
		System.out.println(s5+","+s6);
		
		if(s7.equals(s8))
			System.out.println("same");
			else
				System.out.println("not same");
			
			if(s7.equalsIgnoreCase(s8))
				System.out.println("same");
			else
				System.out.println("not same");
			
			s10 = s9.substring(3);
			
			s11 = s9.substring(3, 10);
			
			System.out.println(s10+", "+s11);
			System.out.println(s9.replace('i', 'Z'));
	}

}

