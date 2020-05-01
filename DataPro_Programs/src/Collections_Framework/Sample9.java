// Demo on Linked List

package Collections_Framework;

import java.util.LinkedList;
public class Sample9 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst("Dhoni");
		list.addLast("Sachin");
		list.addLast("Gambhir");
		list.add("Yuvraj");
		list.addFirst("Shane Warne");
		list.addLast("Sehwag");
		list.add(2,"Sangakkara");
		list.add("Gilchrist");
		
		for(Object obj:list)
			System.out.println(obj);
		
		list.removeFirst();
		list.removeLast();
		list.remove(1);
		list.remove("Sitaramaiah");
		System.out.println("After removing some elements: ");
		for(Object obj:list)
			System.out.println(obj);
		
		list.removeAll(list);
		System.out.println("After removing all the elements ");
		for(Object obj:list)
			System.out.println(obj);

	}

}
