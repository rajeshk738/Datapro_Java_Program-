// Demo on LineNumberReader

package Input_or_Output_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Sample17 {

	public static void main(String[] args) throws Exception {
		
		LineNumberReader reader = new LineNumberReader(new FileReader("F:\\Users\\JavaFile\\mvp.txt"));
		String line;
		int lineNumber;
		
		while((line = reader.readLine()) != null)
		{
			lineNumber = reader.getLineNumber();
			line = lineNumber+"."+line;
			System.out.println(line);
		}
		reader.close();

	}

}
