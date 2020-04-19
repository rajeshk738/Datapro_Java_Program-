// another way, using anonymous unnamed object

package Input_or_Output_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample13 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\Users\\JavaFile\\mvp.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("F:\\Users\\JavaFile\\test1.txt"));
		
		String line;
		while((line = br.readLine()) != null)
		{
			pw.println(line);
		}
		
		pw.close();
		br.close();
		
	}

}
