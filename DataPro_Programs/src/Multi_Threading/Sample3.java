// changing the name of the current thread

package Multi_Threading;

public class Sample3 {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		System.out.println("Name of the thread: "+th.getName());
		th.setName("Thread1");
		
		System.out.println("New name of the thread: "+th.getName());

	}

}
