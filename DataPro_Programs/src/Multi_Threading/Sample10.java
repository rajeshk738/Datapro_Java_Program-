/*
 * Synchronization:
 * When two or more threads are accessing a shared resource, they need some way to ensure that the resource
 * will be used by only one threat at a time to avoid inconsistency
 * 
 * Ex1: A writer thread may update four elements in the array, but the reader thread which executes
 * parallely may read six elements which results in some old values and some updated values
 * 
 * 
 * Program on Synchronization
 */


package Multi_Threading;

class Shared{
	
	synchronized void call(String msg)
	{
		System.out.print("[ ");
		System.out.print(msg);
		System.out.println(" ]");
	}
}

class Caller implements Runnable{
	
	Shared s;
	String msg;
	Thread th;
	
	Caller(Shared s,String msg)
	{
		this.s = s;
		this.msg = msg;
		th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.call(msg);
	}
	
}
public class Sample10 {

	public static void main(String[] args) {
		
		Shared s = new Shared();
		Caller obj1 = new Caller(s, "India");
		Caller obj2 = new Caller(s, "Pakistan");
		Caller obj3 = new Caller(s, "Sri Lanka");

	}

}
