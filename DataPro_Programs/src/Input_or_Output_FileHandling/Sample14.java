// DataOutputStream demo - writing primitive types

package Input_or_Output_FileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Sample14 {

	public static void main(String[] args) throws Exception{
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\Users\\JavaFile\\test_dos.txt"));
		dos.writeInt(36);
		dos.writeChar('x');
		dos.writeBoolean(true);
		dos.writeDouble(45.2354);
		dos.writeUTF("Hello, how r u?");
		dos.close();

	}

}
