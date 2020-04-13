/* throws clause Example1
 * 
 * When library functions or user-defined functions throws exceptions when certain problem occurs
 * the responsibility of the creator of those functions is to mention that a function throws an exception
 * this is done by mentioning the throws followed by Exception type at the function's header line.
 */

package Exception_Handling;

import java.util.Scanner;

class MyStackOverflowException extends Exception{
	
	MyStackOverflowException(String msg)
	{
		super(msg);
	}
}

class MyStackUnderflowException extends Exception{
	
	MyStackUnderflowException(String msg)
	{
		super(msg);
	}
}

class Stack{
	
	final int MAX = 5;
	int a[] = new int[MAX];
	int top;
	
	Stack()
	{
		top = -1;
	}
	
	
	void push(int n) throws MyStackOverflowException
	{
		if(top==MAX-1)
			throw new MyStackOverflowException("Stack is full");
		// throw new ArithemticException("Stack is full");        ----> cannot be resolved arithmetic exception
		
		top++;
		a[top] = n;
	}
	
	
	int pop() throws MyStackUnderflowException
	{
		int n;
		if(top==-1)
			throw new MyStackUnderflowException("Stack is empty");
		n= a[top];
		top--;
		return n;
		
	}
	
	
}

public class Sample14 {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Pushing.....");
		
		try {
			
			while(true)
			{
				System.out.println("Enter a number: ");
				n = scan.nextInt();
				s.push(n);
			}
		}
		
		catch(MyStackOverflowException e)
		{
			System.out.println("Runtime error: "+e.getMessage());
		}
		
		System.out.println("\n Popping.....");
		
		try {
			
			while(true)
				System.out.println(s.pop());
		}
		
		catch(MyStackUnderflowException e)
		{
			System.out.println("Runtime error: "+ e.getMessage());
		}
		
	}

}
