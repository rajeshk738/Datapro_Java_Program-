// file name filtering

package Input_or_Output_FileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class Sample3 {

	public static void main(String[] args) {
		
		String dirname = "F:\\Users\\JavaFile";
		File f1 = new File(dirname);
		
		FilenameFilter ff = new MyExtension(".txt");
		 
		if(f1.isDirectory())
		{
			String strarr[] = f1.list(ff);
			
			for(int i=0; i<strarr.length; i++)
			{
				System.out.println(strarr[i]);
			}
			
		}
		
		else
			System.out.println("Not a directory");

		

	}

}

class MyExtension implements FilenameFilter
{
	String extn;
	public MyExtension(String extn) {
		
		this.extn = extn;
	}
	
	public boolean accept(File x, String fname)
	{
		return fname.endsWith(extn);
	}
}