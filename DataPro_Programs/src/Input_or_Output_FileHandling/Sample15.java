//reading primitive types using DataInputStream

package Input_or_Output_FileHandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Sample15 {

	public static void main(String[] args) throws Exception {
		
		DataInputStream dos = new DataInputStream(new FileInputStream("F:\\Users\\JavaFile\\test_dos.txt"));
		System.out.println("Integer = "+dos.readInt());
		System.out.println("Charactr = "+dos.readChar());
		System.out.println("Boolean = "+dos.readBoolean());
		System.out.println("Double = "+dos.readDouble());
		System.out.println("String = "+dos.readUTF());

	}

}
