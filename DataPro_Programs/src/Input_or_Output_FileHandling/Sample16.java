// displaying the non blank lines only

package Input_or_Output_FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample16 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("F:\\Users\\JavaFile\\mvp.txt"));
		String line;
		int bc=0,nbc=0;
		
		while((line=br.readLine()) != null)
		{
		//	if(line.length() == 0)
			if(line.equals(""))
			{
				
				bc++;
				continue;
			}
			
			nbc++;
			System.out.println(line);
		}
		System.out.println();
		System.out.println("No. of blank lines: "+bc);
		System.out.println("No. of non-blank lines: "+nbc);
		br.close();

	}

}
