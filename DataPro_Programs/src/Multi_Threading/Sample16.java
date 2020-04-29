// Thread Grouping

package Multi_Threading;

class Group implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Sample16 extends Thread{

	public static void main(String[] args) {
		
		ThreadGroup group1 = new ThreadGroup("group1");
		
		Thread th = new Thread(group1, new Sample16());
		
		group1.setMaxPriority(7);
		
		
		ThreadGroup group2 = new ThreadGroup("group2");
		
		Thread th1 = new Thread(group2, new Group());
		
		group1.setMaxPriority(7);
		group2.setMaxPriority(8);
		
		
		System.out.println("main function thread group: "+Thread.currentThread().getThreadGroup()); // main is the top most thread group
		
		
		System.out.println("Sample class Thread group: "+th.getThreadGroup());
		
		System.out.println("group class Thread group: "+th1.getThreadGroup());

	}

}
