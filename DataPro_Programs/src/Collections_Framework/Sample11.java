// LinkedList Demo-another application of Wrapper class

package Collections_Framework;

import java.util.LinkedList;

public class Sample11 {

	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst(67);
		list.addLast(28);
		list.addLast(85);
		list.addLast(36);
		list.addLast(2);
		list.addLast(95);
		list.addLast(56);
		list.remove(new Integer(2));
		System.out.println("\n After removing: ");
		
		for(Object obj:list)
			System.out.println(obj);
		
		
	}

}
