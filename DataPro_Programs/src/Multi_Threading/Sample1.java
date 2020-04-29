// program to print the name of the current thread

package Multi_Threading;

public class Sample1 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Name of the thread: "+t.getName());

	}

}
