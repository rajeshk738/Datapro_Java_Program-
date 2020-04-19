// reading line by line

package Input_or_Output_FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Sample12 {
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("F:\\Users\\JavaFile\\mvp.txt");
		FileWriter fw = new FileWriter("F:\\\\Users\\\\JavaFile\\test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(fw);
		
		String line;
		
		while((line = br.readLine()) != null)
			pw.println(line);
		
		pw.close();
		br.close();
		fw.close();
		fr.close();
	}

}
