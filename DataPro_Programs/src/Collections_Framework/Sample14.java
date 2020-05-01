// Round-3 (Mapping Collections) Hashtable demo

package Collections_Framework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Sample14 {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put("MVP", "datapro");
		ht.put("Vizag","Beach");
		ht.put("Cricket","Sachin");
		ht.put("New Anchor","Arnab Goswami");
		ht.put("Social Activist","Anna Hazare");
		ht.put("Politician","Arvind kejriwal");
		System.out.println("The value of 3 is: "+ht.get("Cricket"));
		
		Set keys = ht.keySet();
		Iterator itr = keys.iterator();
		System.out.println("\n The keys are: ");
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		itr = keys.iterator();
		System.out.println("\nThe keys and corresponding values are: ");
		while(itr.hasNext())
		{
			String str = (String) itr.next();
			System.out.println(str+"\t"+ht.get(str));
		}
		
	}

}
