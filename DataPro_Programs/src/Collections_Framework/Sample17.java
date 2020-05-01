// Round-4 (Date)
// Program Date Example

package Collections_Framework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample17 {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy hh:mm:ss");
		System.out.println(sdf.format(dt));
		

	}

}
