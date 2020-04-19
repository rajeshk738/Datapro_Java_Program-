// (Reading/Writing from/to files)

// using byte stream classes

package Input_or_Output_FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Sample10 {

	public static void main(String[] args) throws Exception {
		
	FileInputStream fis = new FileInputStream("F:\\Users\\JavaFile\\forest.jpg");
	FileOutputStream fos= new FileOutputStream("F:\\Users\\JavaFile\\mountain.jpg");
	int n;
	
	while((n=fis.read())!=-1)
		fos.write(n);
	fis.close();
	fos.close();
	

	}

}
