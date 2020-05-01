// 

package Collections_Framework;

import java.text.DateFormat;
import java.util.Date;

public class Sample18 {

	public static void main(String[] args) {
		
		Date dt = new Date();
		System.out.println(dt);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println(df1.format(dt));
		System.out.println(df2.format(dt));
		System.out.println(df3.format(dt));
		
	}

}
