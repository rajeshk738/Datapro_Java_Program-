/*
 * Creating our own threads -- In Java have two types (1) By Extending Thread class (2) By implementing the Runnable Interface
 * 
 * program for creating a thread by implementing the Runnable Interface
 */


package Multi_Threading;

class Datapro implements Runnable {
	Thread th;
	Datapro()
	{
		th = new Thread(this);
		th.start();
	}
	
	public void run() 
	{
		for(int i = 1;i<=5;i++)
		{
			
			System.out.println(th.getName());
		}
	}
}

public class Sample5 {

	public static void main(String[] args) throws InterruptedException {
		
		Datapro obj = new Datapro();
		for(int i=1;i<=5;i++)
		{
			//Thread.currentThread().sleep(100);                        
			System.out.println(Thread.currentThread().getName());
		}			

	}

}
