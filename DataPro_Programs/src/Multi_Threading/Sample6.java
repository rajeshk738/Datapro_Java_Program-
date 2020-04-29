// creating thread in another way

package Multi_Threading;

class Datapro1 implements Runnable{
	
	public void run()   // the thread's work is put inside the run()
	{
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}
	
}

public class Sample6 {

	public static void main(String[] args) {
		Datapro1 d = new Datapro1();
		Thread th = new Thread(d);
		
		th.start();
		
		for(int i =1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());

	}

}
