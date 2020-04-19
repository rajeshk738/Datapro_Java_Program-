// using InputStream Reader

package Input_or_Output_FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample7 {

	public static void main(String[] args) throws IOException {
		
		int a,b,c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter two no's: ");
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		c = a+b;
		
		System.out.printf("SUM of %d AND %d = %d",a,b,c);
		
	}

}
