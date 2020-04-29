// Using Console class


package Input_or_Output_FileHandling;

import java.io.Console;

public class Sample6 {

	public static void main(String[] args){

		int a,b,c;
		Console con = System.console();
		System.out.println("Enter two no's: ");
		a = Integer.parseInt(con.readLine());
		b = Integer.parseInt(con.readLine());
		
		c = a+b;
		con.format("Sum = %d", c);

		
	}

}
