// TreeSet Demo


package Collections_Framework;

import java.util.TreeSet;

public class Sample2 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("sachin");
		ts.add("saurav");
		ts.add("dhoni");
		ts.add("sachin");
		ts.add("dravid");
		ts.add("pathan");
		ts.add("sachin");
		ts.add("dravid");
		
		for(Object obj:ts)
			System.out.println(obj);
		

	}

}
