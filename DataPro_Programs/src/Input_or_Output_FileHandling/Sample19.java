/*
 * Serialization: Converting the state of an object (value of fields of an object) into a stream of bytes 
 * and storing in a File or sending to a network is known as serialization.
 *  
 *  
 *  Note: If Java didn't have serialization, we have to write each instance variable's value in a file and
 *  we should remember the order...and during deserialization, we have to read individual fields, construct
 *  an object again from those fields.
 *  
 *  Serialization Demo
 */


package Input_or_Output_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample19 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("F:\\Users\\JavaFile\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		Student s = new Student(12,"Sachin Tendulkar","JEE",5000.0);
		out.writeObject(s);

	}

}
