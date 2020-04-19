// Demo on Some File class methods

package Input_or_Output_FileHandling;

import java.io.File;

public class Sample1 {

	public static void main(String[] args) {
		
//		File f = new File("F:\\Users\\JavaFile\\mvp.txt");
		
		File f = new File("F://Users//JavaFile//mvp.txt");
		
		if(f.exists())
			System.out.println("Available");
		else
			System.out.println("not available");
		
		if(f.isFile())
			System.out.println("It is a file");
		else
			System.out.println("It is not a file");
		
		System.out.println("Length = "+f.length());
		System.out.println("Name = "+f.getName());
		System.out.println("Parent = "+f.getParent());
		System.out.println("Path = "+f.getPath());

	}

}
