// Reversing & Sorting a Collection

package Collections_Framework;

import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Sample8 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the strings (enter \"end\" to stop");
		String str;
		
		while(true)
		{
			str = read.nextLine();
			if(str.equals("end"))
				break;
			a1.add(str);
		}
		Iterator itr = a1.iterator();
		System.out.println("Original");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Collections.reverse(a1);
		itr = a1.iterator();
		System.out.println("After reversing: ");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Collections.sort(a1);
		itr = a1.iterator();
		System.out.println("After sorting: ");
		
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
