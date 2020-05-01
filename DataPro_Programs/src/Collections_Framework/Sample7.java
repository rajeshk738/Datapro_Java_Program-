// Vector Example 4

package Collections_Framework;

import java.util.Vector;
import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		Scanner read = new Scanner(System.in);
		
		for(int i=0;i<args.length;i++)
			v.addElement(args[i]);
		
		String str;
		System.out.println("Enter a string: ");
		str = read.nextLine();
		
		if(v.contains(str))
			System.out.println("found");
		else
			System.out.println("not found");

	}

}
