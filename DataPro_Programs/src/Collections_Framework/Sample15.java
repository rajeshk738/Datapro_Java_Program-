// TreeMap Demo

package Collections_Framework;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Sample15 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("F:\\Users\\JavaFile\\TreeMap.txt");
		BufferedReader br = new BufferedReader(fr);
		
		TreeMap tm = new TreeMap();
		Integer fanscount;
		String line = "";
		line = br.readLine();
		
		while(line != null)
		{
			fanscount = (Integer)tm.get(line);
			if(fanscount == null)
				tm.put(line, 1);
			else
				tm.put(line, fanscount+1);
			
			line = br.readLine();
		}
		
		System.out.println("\n Key-Value pairs are: ");
		for(Object k:tm.keySet())
			System.out.println(k+": "+tm.get(k));
		
		br.close();
		fr.close();
}
}