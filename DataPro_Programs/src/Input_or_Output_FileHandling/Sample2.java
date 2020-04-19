// Displaying the list of subdirectories & files in a directory.

package Input_or_Output_FileHandling;

import java.io.File;

public class Sample2 {

	public static void main(String[] args) {
		
		String dirname = "F:\\Users\\JavaFile";
		File f1 = new File(dirname);
		
		if(f1.isDirectory())
		{
			String strarr[] = f1.list();
			for(int i=0; i<strarr.length; i++)
			{
				File f2 = new File(dirname, strarr[i]);
				
				if(f2.isFile())
					System.out.println(strarr[i]+"-> is a file");
				else
					System.out.println(strarr[i]+"-> IS A SUB-DIRECTORY");
			}
			
		}
		
		else
			System.out.println("Not a directory");

	}

}
