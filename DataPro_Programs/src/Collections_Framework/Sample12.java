// Stack Demo 

package Collections_Framework;

import java.util.Stack;
import java.util.Scanner;

public class Sample12 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.println("Enter the strings (enter \"end\"to stop");
		
		while(true)
		{
			str = scan.nextLine();
			if(str.equals("end"))
				break;
			s.push(str);
		}
		
		System.out.println("Top element = "+s.peek());
		while(!s.isEmpty())
			System.out.println(s.pop());

	}

}
