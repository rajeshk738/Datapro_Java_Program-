// Getting System Properties

package Collections_Framework;

import java.util.Enumeration;
import java.util.Properties;

public class Sample23 {

	public static void main(String[] args) {
		
		Properties sysprop = System.getProperties();
		Enumeration list = sysprop.propertyNames();
		String key;
		
		while(list.hasMoreElements())
		{
			key = (String)list.nextElement();
			System.out.println(key.toUpperCase()+": "+sysprop.getProperty(key)+"\n\n");
			
		}
	}

}
