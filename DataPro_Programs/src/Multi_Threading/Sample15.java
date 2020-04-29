/* 
 * In Java, the thread scheduler can use the thread priorities in the form integer values (0 to 10) to each of its thread
 * to determine the execution schedule of the threads.the thread scheduler provides the CPU time to threads of highest priority
 * during ready-to-run state.
 * 
 * Constants:
 * 
 * Thread.MAX_PRIORITY  ---- The maximum priority of any thread (an int value of 10)
 * Thread.MIN_PRIORITY  ---- The maximum priority of any thread (an int value of 1)
 * Thread.NORM_PRIORITY  ---- The maximum priority of any thread (an int value of 5)
 * 
 * 
 * program on Setting Thread priorities - Demo
 * 
 * Note: Thread priorities are not guaranteed to have any effect. Thread priorities don't often produce desired results, it depends 
 * on OS.
 */

package Multi_Threading;

class Hello1 extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
public class Sample15 {

	public static void main(String[] args) {
		Hello1 th1 = new Hello1();
		Hello1 th2 = new Hello1();
		Hello1 th3 = new Hello1();
		
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
		th3.start();
	}

}
