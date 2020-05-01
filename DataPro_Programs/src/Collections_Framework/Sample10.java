// list.removeALL(list)

package Collections_Framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample10 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst("one");
		list.addLast("two");
		list.addLast("three");
		list.addLast("four");
		list.addLast("five");
		list.addLast("six");
		list.addLast("seven");
		
		ArrayList a = new ArrayList();
		a.add("banglore");
		a.add("hyderabad");
		a.add("two");
		a.add("seven");
		a.add("one");
		list.removeAll(a);
		System.out.println("\nAfter removing (a set of elements): ");
		for(Object obj: list)
			System.out.println(obj);

	}

}
