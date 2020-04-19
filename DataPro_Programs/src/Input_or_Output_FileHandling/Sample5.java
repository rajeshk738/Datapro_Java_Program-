// using DataInputStream class


package Input_or_Output_FileHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		
		int a,b,c;
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter two no's: ");
		
		a = Integer.parseInt(dis.readLine());
		b = Integer.parseInt(dis.readLine());
		
		c = a+b;
		
		System.out.printf("Sum = %d",c);
		

	}

}
