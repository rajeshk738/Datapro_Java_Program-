// HashMap VS TreeMap VS LinkedHashMap

package Collections_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Sample16 {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("C","AT & T");
		hm.put("C++", "AT & T");
		hm.put("Java", "Sun");
		hm.put("C#", "Microsoft");
		hm.put("Oracle", "Oracle corporation");
		hm.put("B", "AT & T");
		System.out.println("HashMap output - Random ");
		
		for(Object obj: hm.keySet())
			System.out.println(obj+": "+hm.get(obj));
		//----------------------------------------------------
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("C","AT & T");
		lhm.put("C++", "AT & T");
		lhm.put("Java", "Sun");
		lhm.put("C#", "Microsoft");
		lhm.put("Oracle", "Oracle corporation");
		lhm.put("B", "AT & T");		
		System.out.println("\nLinkedHashMap output --given order ");
		
		for(Object obj: lhm.keySet())
			System.out.println(obj+": "+lhm.get(obj));
		//---------------------------------------------------------------
		TreeMap tm = new TreeMap();
		tm.put("C","AT & T");
		tm.put("C++", "AT & T");
		tm.put("Java", "Sun");
		tm.put("C#", "Microsoft");
		tm.put("Oracle", "Oracle corporation");
		tm.put("B", "AT & T");		
		System.out.println("\nTreeMap output --sorted ");
		
		for(Object obj: tm.keySet())
			System.out.println(obj+": "+tm.get(obj));	

	}

}
