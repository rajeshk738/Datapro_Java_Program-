/*
 * user threads are created by user and Daemon threads are created by JVM to serve the user threads.
 * 
 * In order for an application to continue running, it must always have atleat one live user thread.
 * 
 * A classic example of a daemon thread is the garbage collector thread found in many Java Virtual Machines.
 * It needs to run continuously while any other threads are running, but should not prevent the program from exiting.
 * When the program exits, there is no more need for a garbage collector.
 */

package Multi_Threading;

class Hello extends Thread{
	
	public void run()
	{
		int count =0;
		
		while(true)
		{
			System.out.println("India");
			count++;
			System.out.println("Loop Count: "+count);  // varies
		}
	}
}
public class Sample14 {

	public static void main(String[] args) {
		
		Hello h = new Hello();
		h.setDaemon(true);
		h.start();
		System.out.println("Good Bye");

	}

}
