// Date Example 3

package Collections_Framework;

import java.text.DateFormat;
import java.util.Date;

public class Sample19 {

	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		DateFormat df1 = DateFormat.getTimeInstance(DateFormat.FULL);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.SHORT);
		DateFormat df3 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		
		System.out.println(df1.format(dt));
		System.out.println(df2.format(dt));
		System.out.println(df3.format(dt));
		

	}

}
