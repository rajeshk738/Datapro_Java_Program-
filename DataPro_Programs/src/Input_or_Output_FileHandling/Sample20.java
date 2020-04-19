// Deserialization Demo

package Input_or_Output_FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Sample20 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("F:\\\\Users\\\\JavaFile\\\\obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student)ois.readObject();
		System.out.println(s);

	}

}
