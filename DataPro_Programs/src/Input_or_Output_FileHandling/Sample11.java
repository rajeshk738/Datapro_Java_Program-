// using character stream classes

package Input_or_Output_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Sample11 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("F:\\Users\\JavaFile\\mvp.txt");
		FileWriter fw = new FileWriter("F:\\Users\\JavaFile\\mvp_copy.txt");
		
		int n;
		
		while((n=fr.read()) != -1)
			fw.write(n);
		
		fr.close();
		fw.close();

	}

}
