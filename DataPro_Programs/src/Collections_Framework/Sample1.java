// HashSet Demo

package Collections_Framework;

import java.util.HashSet;
import java.util.Iterator;
public class Sample1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("sachin");
		hs.add("saurav");
		hs.add("dhoni");
		hs.add("sachin");
		hs.add("dravid");
		hs.add("pathan");
		hs.add("sachin");
		hs.add("dravid");
	
		for(Object obj:hs)
		{
			System.out.println(obj);
		}
		
		Iterator itr = hs.iterator();
		System.out.println("----------------------------------");
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
